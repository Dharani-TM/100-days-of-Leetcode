import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.nextLine();
        String needle = sc.nextLine();

        int result = haystack.indexOf(needle);

        System.out.println(result);

        sc.close();
    }
}
