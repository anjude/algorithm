package test;

import solution.leetCode.ListNode;

/**
 * Created by Anjude
 * Date: 2021/4/5 13:02
 */
public class HeBingLianBiao {
    public static void main(String[] args) {
        ListNode L1 = new ListNode(1);
        L1.next = new ListNode(2);
        L1.next.next = new ListNode();

        ListNode L2 = new ListNode(1);
        L2.next = new ListNode(3);
        L2.next.next = new ListNode(4);
        L2.next.next.next = new ListNode();

        Solution6 solution6 = new Solution6();
        ListNode cur = solution6.mergeTwoLists(L1, L2);
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }

    }
}

class Solution6 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;

    }
}