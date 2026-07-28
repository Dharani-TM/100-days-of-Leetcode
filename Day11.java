import java.util.*;

public class Day11 {

    static int kadaneMax(int[] arr) {
        int maxSum = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSum = Math.max(maxSum, curr);
        }

        return maxSum;
    }

    static int kadaneMin(int[] arr) {
        int minSum = arr[0];
        int curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.min(arr[i], curr + arr[i]);
            minSum = Math.min(minSum, curr);
        }

        return minSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int maxNormal = kadaneMax(arr);

        // If all numbers are negative
        if (maxNormal < 0) {
            System.out.println(maxNormal);
            return;
        }

        int minSum = kadaneMin(arr);
        int maxCircular = total - minSum;

        System.out.println(Math.max(maxNormal, maxCircular));
    }
}