package solution.jzoffer;

import solution.leetCode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/19 21:52
 */
public class JZ3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        while (listNode != null) {
            res.add(0, listNode.val);
            listNode = listNode.next;
        }
        return res;
    }
}
