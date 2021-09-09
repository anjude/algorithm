package solution.offer.lilisi;

import solution.leetCode.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

/**
 * T3  TODO
 *
 * @author Anjude
 * @date 2021/9/6 19:48
 */
public class T3 {
    private static String IN = "in";
    private static String OUT = "out";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<LlsNode> queue = new LinkedList<>();
        Map<Integer, LinkedList<LlsNode>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            s1 = sc.nextLine();
            String[] s2 = s1.split(" ");
            String opt = s2[0];
            int type = Integer.parseInt(s2[1]);
            if (IN.equals(opt)) {
                String s = s2[2];
                LlsNode llsNode = new LlsNode(type, s);
                queue.add(llsNode);
                LinkedList<LlsNode> list = map.get(type);
                if (list == null) {
                    LinkedList<LlsNode> linkedList = new LinkedList<>();
                    linkedList.add(llsNode);
                    map.put(type, linkedList);
                } else {
                    list.add(llsNode);
                    map.put(type, list);
                }
            } else {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                if (type == 0) {
                    LlsNode poll = queue.poll();
                    LinkedList<LlsNode> llsNodes = map.get(poll.type);
                    llsNodes.removeLast();
                    map.put(poll.type, llsNodes);
                    System.out.println(poll.s);
                } else {
                    LinkedList<LlsNode> llsNodes = map.get(type);
                    if (Objects.isNull(llsNodes)) {
                        System.out.println(-1);
                        continue;
                    }
                    LlsNode llsNode = llsNodes.removeLast();
                    map.put(type, llsNodes);
                    System.out.println(llsNode.s);
                }
            }
        }
    }

    static class LlsNode {
        int type;
        String s;

        public LlsNode(int _type, String _s) {
            type = _type;
            s = _s;
        }
    }
}
