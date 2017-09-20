
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public class Chicken {
    public static void main(final String[] args) {
        System.out.println(Chicken.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        System.out.println(Chicken.countWords(Chicken.urlToString("http://erdani.com/tdpl/hamlet.txt")));
    }

    public static String urlToString(final String url) {

        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int countWords(String str){
        int count=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==' ')
                count++;
            }

        return count;
    }
}
