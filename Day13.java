import java.util.Scanner;

public class Day13 {

    public static boolean hasMatch(String s, String p) {

        int star = p.indexOf('*');

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        int n = s.length();

        for (int i = 0; i <= n - left.length(); i++) {
            if (!s.startsWith(left, i))
                continue;

            int j = i + left.length();
            for (int k = j; k <= n - right.length(); k++) {
                if (s.startsWith(right, k))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        System.out.println(hasMatch(s, p));
        sc.close();
    }
}