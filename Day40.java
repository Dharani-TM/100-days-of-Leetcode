import java.util.*;

public class Day40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] candyType = new int[n];

        for (int i = 0; i < n; i++) {
            candyType[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        int answer = Math.min(set.size(), n / 2);

        System.out.println(answer);

        sc.close();
    }
}