import java.util.*;

public class Day41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = -1;

        for (int i = 0; i < n; i++) {

            int maxLeft = nums[0];

            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, nums[j]);
            }

            int minRight = nums[i];

            for (int j = i; j < n; j++) {
                minRight = Math.min(minRight, nums[j]);
            }

            if (maxLeft - minRight <= k) {
                result = i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}