package laba2.deputy;

import java.util.Map;

interface YouTubeApiClient {
    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}