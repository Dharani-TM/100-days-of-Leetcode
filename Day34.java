import java.util.*;

public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
        } else {
            while (n % 3 == 0) {
                n /= 3;
            }

            System.out.println(n == 1);
        }

        sc.close();
    }
}
