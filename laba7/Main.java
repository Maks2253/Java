import java.util.*;

public class Main {
    public static void main(String[] args) {

        Videoblog blog = new Videoblog("Max Blogger");

        Video v1 = new Video("Game Review", "url1", 12000, 500, 20);
        v1.addComment(new Comment("Cool!", 600, 10));
        v1.addComment(new Comment("Not bad", 100, 3));

        Video v2 = new Video("Tutorial", "url2", 8000, 300, 40);
        v2.addComment(new Comment("Great", 100, 5));

        Video v3 = new Video("Funny moments", "url3", 15000, 1000, 40);
        v3.addComment(new Comment("Hilarious!", 900, 7));
        v3.addComment(new Comment("Super video!", 1100, 20));

        blog.addVideo(v1);
        blog.addVideo(v2);
        blog.addVideo(v3);

        // -------------------------------------------------------------------
        // 1) Сумарна кількість переглядів — нетипізований Iterator (варіант a)
        // -------------------------------------------------------------------
        int totalViews = 0;

        Iterator it = blog.getVideos().iterator();   // нетипізований ітератор
        while (it.hasNext()) {
            Video v = (Video) it.next();             // кастинг
            totalViews += v.getViews();
        }

        System.out.println("Загальна кількість переглядів: " + totalViews);

        // -------------------------------------------------------------------
        // 2) Чи є коментар з лайками > лайків відео — for-each (варіант c)
        // -------------------------------------------------------------------
        boolean found = false;

        for (Video v : blog.getVideos()) {               // типізований for-each
            for (Comment c : v.getComments()) {
                if (c.getLikes() > v.getLikes()) {
                    found = true;
                    break;
                }
            }
        }

        System.out.println("Є коментар з лайками > лайків відео? " + found);

        // -------------------------------------------------------------------
        // 3) Відео з максимумом дизлайків — типізований Iterator (варіант b)
        // -------------------------------------------------------------------
        int maxDislikes = 0;

        Iterator<Video> it3 = blog.getVideos().iterator(); // типізований
        while (it3.hasNext()) {
            Video v = it3.next();
            if (v.getDislikes() > maxDislikes) {
                maxDislikes = v.getDislikes();
            }
        }

        List<Video> result = new ArrayList<>();
        Iterator<Video> it4 = blog.getVideos().iterator();
        while (it4.hasNext()) {
            Video v = it4.next();
            if (v.getDislikes() == maxDislikes) {
                result.add(v);
            }
        }

        System.out.println("Відео з найбільшою кількістю дизлайків: " + result);
    }
}
