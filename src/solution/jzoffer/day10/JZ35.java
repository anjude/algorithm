package solution.jzoffer.day10;


import solution.leetCode.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * JZ35  构建一个map，存储原链表和新链表的映射
 *
 * @author Anjude
 * @date 2021/7/16 22:26
 */
public class JZ35 {
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!= null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
