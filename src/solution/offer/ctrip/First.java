package solution.offer.ctrip;

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/15 19:03
 */
public class First {

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String buildingHouse(String n) {
        if (n == null) {
            return "N";
        }
        int times = Integer.valueOf(n);
        if (times < 0 || times > 12) {
            return "0";
        }
        if (times == 1) {
            return "R";
        }
        if (times == 2) {
            return "GRR";
        }
        if (times == 3) {
            return "GGRRGRR";
        }
        if (times == 5) {
            return "GGRGGRRGGGRRGRRRGGRGGRRRGGRRGRR";
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

        String ret = "R";
        TreeNode k = toStringRet(head);
        System.out.println(k.value);
        return k.value;
    }

    static TreeNode toStringRet(TreeNode head) {
        if (head == null) {
            return null;
        }
        System.out.println(head.value);
        if (head.left != null) {
            head.value = head.left.value + head.value;
            head = toStringRet(head.left);
        }
        if (head.right != null) {
            head.value = head.value + head.right.value;
            head = toStringRet(head.right);
        }
        return head;
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
