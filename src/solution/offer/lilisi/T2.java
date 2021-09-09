package solution.offer.lilisi;

import solution.leetCode.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/9/6 19:46
 */
public class T2 {
    public ListNode sortList(ListNode head) {
        if(head == null) return null;
        Map<Integer, Integer> map = new TreeMap<>();
        Set<Integer> set = new HashSet<>();
        while (head != null) {
            set.add(head.val);
            map.put(head.val, map.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        int[] list = new int[set.size()];
        Arrays.sort(list);
        int index = 0;
        for (Integer integer : set) {
            list[index++] = integer;
        }
        head = new ListNode(0);
        ListNode newHead = head;
        int size = map.size();
        int cur = 0;
        while (cur < size) {
            cur = 0;
            for (int i : list) {
                int times = map.get(i);
                if (times > 0) {
                    head.next = new ListNode(i);
                    head = head.next;
                    map.put(i, times - 1);
                } else {
                    cur++;
                }
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        new T2().sortList(new ListNode(0));
    }
}
