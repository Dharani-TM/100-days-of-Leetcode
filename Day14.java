import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Day14 {

    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(false);
            return;
        }

        ListNode[] nodes = new ListNode[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = new ListNode(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        int pos = sc.nextInt();

        if (pos != -1) {
            nodes[n - 1].next = nodes[pos];
        }

        System.out.println(hasCycle(nodes[0]));

        sc.close();
    }
}