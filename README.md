This program uses an API from AssemblyAI to provide a transcript of a sample audio file (harvard.mp3)


Json Request:

{"audio_url":"https://github.com/avi20025/Speech-Converter/blob/main/harvard.mp3?raw\u003dtrue"}

Post Response Body:

{"id": "6dv1oa7qwo-c65c-4ee6-a791-7f4bc3899189", "language_model": "assemblyai_default", "acoustic_model": "assemblyai_default", "language_code": "en_us", "status": "queued", "audio_url": "https://github.com/avi20025/Speech-Converter/blob/main/harvard.mp3?raw=true", "text": null, "words": null, "utterances": null, "confidence": null, "audio_duration": null, "punctuate": true, "format_text": true, "dual_channel": null, "webhook_url": null, "webhook_status_code": null, "webhook_auth": false, "webhook_auth_header_name": null, "speed_boost": false, "auto_highlights_result": null, "auto_highlights": false, "audio_start_from": null, "audio_end_at": null, "word_boost": [], "boost_param": null, "filter_profanity": false, "redact_pii": false, "redact_pii_audio": false, "redact_pii_audio_quality": null, "redact_pii_policies": null, "redact_pii_sub": null, "speaker_labels": false, "content_safety": false, "iab_categories": false, "content_safety_labels": {}, "iab_categories_result": {}, "language_detection": false, "custom_spelling": null, "throttled": null, "auto_chapters": false, "summarization": false, "summary_type": null, "summary_model": null, "custom_topics": false, "topics": [], "speech_threshold": null, "disfluencies": false, "sentiment_analysis": false, "sentiment_analysis_results": null, "chapters": null, "entity_detection": false, "entities": null, "speakers_expected": null}

Output of processing audio and generating transcript:

<img width="1001" alt="Screen Shot 2023-10-07 at 8 12 14 PM" src="https://github.com/avi20025/Speech-Converter/assets/100166555/8d119700-5943-4d2b-a1dd-3eaae3a34d94">
