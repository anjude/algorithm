package solution.offer.lilisi;

import solution.leetCode.ListNode;

import java.util.List;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/9/6 19:23
 */
public class T1 {
    public ListNode formatList(ListNode head) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        if (head == null || head.next == null || head.next.next == null) return head;
        ListNode curTail = head;
        ListNode curHead = head;
        ListNode curNode = head.next;
        while (curNode != null) {
            if (curNode.next == null) {
                ListNode oldTail = curTail;
                curTail = curNode;
                curNode = null;
                oldTail.next = curTail;
                continue;
            }
            ListNode temp = curNode.next.next;
            ListNode oldHead = curHead;
            ListNode oldTail = curTail;
            curTail = curNode;
            curHead = curNode.next;
            curNode = temp;
            curHead.next = oldHead;
            oldTail.next = curTail;
        }
        curTail.next = null;
        return curHead;
    }

    public static void main(String[] args) {
        ListNode listNode = new T1().formatList(new ListNode());
        System.out.println(listNode);
    }
}
