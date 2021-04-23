package solution.leetCode;

/**
 * Created by Anjude
 * Date: 2021/4/5 15:06
 */
public class Q61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode prev = head;
        int size = 0;
        while (head != null) {
            size++;
            if (head.next == null) {
                head.next = prev;
                break;
            }
            head = head.next;
        }
        head = prev;
        k = size - (k % size);
        for (int i = 0; i < k - 1; i++) {
            head = head.next;
        }
        prev = head.next;
        head.next = null;
        return prev;
    }

    public ListNode official(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        int n = 1;
        ListNode iter = head;
        while (iter.next != null) {
            iter = iter.next;
            n++;
        }
        int add = n - k % n;
        if (add == n) {
            return head;
        }
        iter.next = head;
        while (add-- > 0) {
            iter = iter.next;
        }
        ListNode ret = iter.next;
        iter.next = null;
        return ret;
    }
}
