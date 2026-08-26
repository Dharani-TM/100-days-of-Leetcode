import java.util.*;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] count = new int[51];

        for (int i = 0; i <= n - k; i++) {
            boolean[] seen = new boolean[51];

            for (int j = i; j < i + k; j++) {
                int num = nums[j];

                if (!seen[num]) {
                    count[num]++;
                    seen[num] = true;
                }
            }
        }

        int answer = -1;

        for (int num = 0; num <= 50; num++) {
            if (count[num] == 1) {
                answer = num;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}