import java.util.*;

public class Day42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        if (n >= 1000) {
            count += n - 999;
        }

        if (n >= 100000) {
            count += n - 100000;
        }

        System.out.println(count);

        sc.close();
    }
}