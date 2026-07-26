import java.util.*;

public class Day9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] first = new int[26];
        Arrays.fill(first, -1);

        int max = -1;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                max = Math.max(max, i - first[index] - 1);
            }
        }

        System.out.println(max);
    }
}