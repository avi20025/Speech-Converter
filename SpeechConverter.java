import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;

public class SpeechConverter 
{
    public static void main(String[] args) throws Exception
    {
        Transcript transcript = new Transcript();

        transcript.setAudio_url("https://github.com/avi20025/Speech-Converter/blob/main/harvard.mp3?raw=true");

        Gson gson = new Gson();

        String jsonRequest = gson.toJson(transcript); 

        System.out.println(jsonRequest);

        HttpRequest postReq = HttpRequest.newBuilder()
            .uri(new URI("https://api.assemblyai.com/v2/transcript"))
            .header("Authorization", APIKey.APIkey)
            .POST(BodyPublishers.ofString(jsonRequest))
            .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postReq, BodyHandlers.ofString());

        System.out.println(postResponse.body());

        transcript = gson.fromJson(postResponse.body(), Transcript.class);

        System.out.println(transcript.getId());

        HttpRequest getRequest = HttpRequest.newBuilder()
            .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
            .header("Authorization", APIKey.APIkey)
            .build();

        while(true)
        {    
            HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());
            transcript = gson.fromJson(getResponse.body(), Transcript.class);

            System.out.println(transcript.getStatus());

            if("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus()))
            {
                break;
            }
            Thread.sleep(1000);
        }
        System.out.println("Transcription completed!");
        System.out.println(transcript.getText());
    }
}