package solution.jzoffer.day5;

import solution.leetCode.ListNode;

/**
 * JZ25  遍历合并即可
 *
 * @author Anjude
 * @date 2021/7/11 17:34
 */
public class JZ25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        ListNode pre = new ListNode();
        ListNode curHead = pre;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                curHead.next = l2;
                l2 = l2.next;
            } else {
                curHead.next = l1;
                l1 = l1.next;
            }
            curHead = curHead.next;
        }
        curHead.next = l1 == null ? l2 : l1;
        return pre.next;
    }
}
