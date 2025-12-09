import java.util.*;

public class Videoblog {
    private String bloggerName;
    private List<Video> videos = new ArrayList<>();

    public Videoblog(String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void addVideo(Video v) {
        videos.add(v);
    }
}
