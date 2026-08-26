import java.util.*;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();

        // Check if reshape is possible
        if (m * n != r * c) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            int[][] result = new int[r][c];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int index = i * n + j;

                    int newRow = index / c;
                    int newCol = index % c;

                    result[newRow][newCol] = mat[i][j];
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}