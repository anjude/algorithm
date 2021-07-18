package solution.jzoffer.day9;

import solution.leetCode.ListNode;

import java.util.List;

/**
 * JZ18  双指针
 *
 * @author Anjude
 * @date 2021/7/14 0:43
 */
public class JZ18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        if (head.val == val) return head.next;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}
