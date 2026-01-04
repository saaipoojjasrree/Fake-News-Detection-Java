import java.util.*;

public class FakeNewsDetection {

    static String[] fakeKeywords = {
        "aliens", "miracle", "cures", "magic", "hoax"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter news text:");
        String news = sc.nextLine().toLowerCase();

        boolean isFake = false;

        for (String word : fakeKeywords) {
            if (news.contains(word)) {
                isFake = true;
                break;
            }
        }

        if (isFake)
            System.out.println("Result: Fake News");
        else
            System.out.println("Result: Real News");

        sc.close();
    }
}
