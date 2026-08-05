import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char ch = sc.next().charAt(0);

        int index = word.indexOf(ch);

        if (index == -1) {
            System.out.println(word);
            return;
        }

        char[] arr = word.toCharArray();

        int left = 0;
        int right = index;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));

        sc.close();
    }
}