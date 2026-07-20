import java.util.*;
public class Day3 {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k = k % total;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            int oldIndex = (i - k + total) % total;
            int row = oldIndex / n;
            int col = oldIndex % n;
            if (i % n == 0)
                ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(grid[row][col]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 1;
        List<List<Integer>> result = shiftGrid(grid, k);
        System.out.println(result);
    }
}