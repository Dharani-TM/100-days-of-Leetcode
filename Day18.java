import java.util.*;

public class Day18 {

    public static List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
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

        List<Integer> result = findMissingElements(nums);

        System.out.println(result);

        sc.close();
    }
}