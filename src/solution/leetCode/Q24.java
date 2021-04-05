package solution.leetCode;

import org.w3c.dom.NodeList;

/**
 * Created by Anjude
 * Date: 2021/4/5 14:23
 */
public class Q24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }
}
