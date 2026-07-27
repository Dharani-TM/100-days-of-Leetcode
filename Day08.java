import java.util.*;

public class Day8 {

    public static String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        HashSet<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        HashMap<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        String[] words = paragraph.split("\\s+");

        for (String word : words) {

            if (word.length() == 0)
                continue;

            if (!bannedSet.contains(word)) {

                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);

                if (count > max) {
                    max = count;
                    ans = word;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String paragraph = sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        String[] banned = new String[n];

        for (int i = 0; i < n; i++) {
            banned[i] = sc.nextLine();
        }

        System.out.println(mostCommonWord(paragraph, banned));

        sc.close();
    }
}
