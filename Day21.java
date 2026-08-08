import java.util.Scanner;

public class Day21 {

    public static int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int answer = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                answer = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(mySqrt(x));

        sc.close();
    }
}
