import java.util.*;

public class Day44 {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            if (i < n && !stack.isEmpty()) {
                result[index] = stack.peek();
            }

            stack.push(nums[index]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = nextGreaterElements(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}