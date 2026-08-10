import java.util.*;

public class Day24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int left = 0;
        long product = 1;
        int count = 0;

        for (int right = 0; right < n; right++) {

            product = product * nums[right];

            while (left <= right && product >= k) {
                product = product / nums[left];
                left++;
            }

            count = count + (right - left + 1);
        }

        System.out.println(count);

        sc.close();
    }
}
