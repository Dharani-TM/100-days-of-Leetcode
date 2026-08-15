import java.util.*;

public class Day30 {
    public static int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }

        if (!hasNonZero) {
            return 0;
        }

        if (xor != 0) {
            return nums.length;
        }

        return nums.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(longestSubsequence(nums));

        sc.close();
    }
}