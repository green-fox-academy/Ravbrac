package url_fixer;


public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url);
        System.out.println(url.replace("bots", "odds").replace("https", "https:"));

        // I can't really think of another string function to solve this task other than "replace". I'll try to find
        // some alternatives after I'm done with the other tasks.
    }
}
