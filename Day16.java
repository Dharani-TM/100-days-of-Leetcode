import java.util.*;

public class Day16 {

    public static List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            int minCol = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                ans.add(matrix[i][minCol]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> result = luckyNumbers(matrix);
        System.out.println(result);
        sc.close();
    }
}