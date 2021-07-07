package solution.jzoffer.day4;

import solution.leetCode.ListNode;

import java.util.Stack;

/**
 * JZ6  利用栈的特性
 *
 * @author Anjude
 * @date 2021/7/5 23:25
 */
public class JZ6 {
    public int[] reversePrint(ListNode head) {
        int n = 0;
        Stack<Integer> s = new Stack<>();
        while (head != null){
            n++;
            s.push(head.val);
            head = head.next;
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            res[i] = s.pop();
        }
        return res;
    }
}
