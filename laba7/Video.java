import java.util.*;

public class Video {
    private String title;
    private String url;
    private int views;
    private int likes;
    private int dislikes;

    private List<Comment> comments = new ArrayList<>();

    public Video(String title, String url, int views, int likes, int dislikes) {
        this.title = title;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public int getViews() { 
        return views; 
    }

    public int getLikes() { 
        return likes; 
    }

    public int getDislikes() { 
        return dislikes; 
    }

    public List<Comment> getComments() { 
        return comments; 
    }

    public void addComment(Comment c) {
        comments.add(c);
    }

    @Override
    public String toString() {
        return "Video{" + title + ", dislikes=" + dislikes + "}";
    }
}
