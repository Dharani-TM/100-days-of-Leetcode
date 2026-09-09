import java.util.Scanner;

public class Day43 {

    public static long countCommas(long n) {
        long result = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long nextStart = start * 1000;

            long end = Math.min(n, nextStart - 1);

            result += (end - start + 1) * commas;

            start = nextStart;
            commas++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long answer = countCommas(n);

        System.out.println(answer);

        sc.close();
    }
}