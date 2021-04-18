package solution.offer.ctrip;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/15 19:03
 */
public class First {

    public static String ret = "";

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String buildingHouse(String n) {
        if (n == null) {
            return "N";
        }
        int times = Integer.parseInt(n);
        if (times < 0 || times > 12) {
            return "0";
        }
        TreeNode head = new TreeNode("R");
        List<TreeNode> cur = new ArrayList<>();
        cur.add(head);
        for (int i = 1; i < times; i++) {
            int len = cur.size();
            for (int j = 0; j < len; j++) {
                TreeNode addCur = cur.get(0);
                TreeNode right = new TreeNode("R");
                TreeNode left = new TreeNode("G");
                addCur.right = right;
                addCur.left = left;
                cur.remove(0);
                cur.add(right);
                cur.add(left);
            }
        }
        toStringRet(head);
        return ret;
    }

    static void toStringRet(TreeNode head) {
        if (head == null) {
            return;
        }
        toStringRet(head.left);
        System.out.println(head.value);
        ret += head.value;
        toStringRet(head.right);
    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        String _n;
        try {
            _n = in.nextLine();
        } catch (Exception e) {
            _n = null;
        }

        res = buildingHouse(_n);
        System.out.println(res);
    }

    static class TreeNode {
        public String value;
        TreeNode right;
        TreeNode left;

        TreeNode() {

        }

        TreeNode(String value) {
            this.value = value;
        }

        TreeNode(char value, TreeNode right) {
            this.right = right;
        }
    }
}
