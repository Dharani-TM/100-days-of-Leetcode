import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int[] shifts = new int[n];
        for (int i = 0; i < n; i++) {
            shifts[i] = sc.nextInt();
        }

        char[] arr = s.toCharArray();
        long total = 0;
        for (int i = n - 1; i >= 0; i--) {
            total = (total + shifts[i]) % 26;

            arr[i] = (char) ((arr[i] - 'a' + total) % 26 + 'a');
        }

        System.out.println(new String(arr));

        sc.close();
    }
}