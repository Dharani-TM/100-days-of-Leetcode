import java.util.*;

public class Day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] start = new int[2];
        int[] target = new int[2];

        start[0] = sc.nextInt();
        start[1] = sc.nextInt();

        target[0] = sc.nextInt();
        target[1] = sc.nextInt();

        Solution sol = new Solution();

        System.out.println(sol.canReach(start, target));

        sc.close();
    }
}

class Solution {
    public boolean canReach(int[] start, int[] target) {
        return (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2;
    }
}