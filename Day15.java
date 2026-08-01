import java.util.Scanner;

public class Day15 {

    public static int maxRepeating(String sequence, String word) {

        String temp = "";
        int count = 0;

        while (true) {
            temp += word;

            if (sequence.contains(temp)) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sequence = sc.next();
        String word = sc.next();

        System.out.println(maxRepeating(sequence, word));

        sc.close();
    }
}