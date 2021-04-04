package solution.leetCode;

/**
 * Created by Anjude
 * Date: 2021/4/4 13:33
 */
public class Q206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
