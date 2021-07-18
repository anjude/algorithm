package solution.jzoffer.day8;

import solution.leetCode.ListNode;

/**
 * JZ22  快慢指针
 *
 * @author Anjude
 * @date 2021/7/12 20:27
 */
public class JZ22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode l = head;
        ListNode h = head;
        for (int i = 0; i < k; i++) {
            h = h.next;
        }
        while (h != null) {
            h = h.next;
            l = l.next;
        }
        return l;
    }
}
