import java.util.Arrays;

public class Day1 {

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);

        int small = nums[0];
        int large = nums[nums.length - 1];

        while (large != 0) {
            int temp = large;
            large = small % large;
            small = temp;
        }

        return small;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};

        int ans = findGCD(nums);

        System.out.println("GCD = " + ans);
    }
}