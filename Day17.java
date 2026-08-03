import java.util.Scanner;

public class Day17 {

    // Returns the largest digit in a number
    public static int largestDigit(int num) {
        int max = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }

        return max;
    }

    public static int maxSum(int[] nums) {

        int ans = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (largestDigit(nums[i]) == largestDigit(nums[j])) {
                    ans = Math.max(ans, nums[i] + nums[j]);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSum(nums));

        sc.close();
    }
}