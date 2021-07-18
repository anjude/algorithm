package solution.jzoffer.day9;

import solution.leetCode.ListNode;

import java.util.List;

/**
 * JZ24  可用递归和迭代
 *
 * @author Anjude
 * @date 2021/7/13 22:07
 */
public class JZ24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
    }
}
