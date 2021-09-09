package solution.offer.tencent09;

import solution.leetCode.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/9/5 20:03
 */
public class T1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param a ListNode类一维数组 指向这些数链的开头
     * @return ListNode类
     */
    public ListNode solve(ListNode[] a) {
        ListNode pre = new ListNode(0);
        ListNode head = new ListNode(0);
        pre.next = head;
        int len = a.length;
        int cur = 0;
        while (cur < len) {
            cur = 0;
            for (int i = 0; i < len; i++) {
                ListNode node = a[i];
                if (node != null) {
                    head.next = node;
                    head = head.next;
                    a[i] = node.next;
                } else {
                    cur++;
                }
            }
        }
        return head.next;
    }
}
