package solution.leetCode.sortandother;

import solution.leetCode.ListNode;

/**
 * Created by Anjude
 * Date: 2021/4/6 1:01
 */
public class Q92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode origin = head;
        for (int i = 0; i < left - 1; i++) {
            head = head.next;
        }
        for (int i = left; i < right; i++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = head;

        }
        return origin;
    }
}
