package solution.jzoffer.day13;

import solution.leetCode.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * JZ32  层序遍历
 *
 * @author Anjude
 * @date 2021/7/19 23:38
 */
public class JZ32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[]{};
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            TreeNode cur = queue.poll();
            res.add(cur.val);
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        int[] ints = Arrays.stream(res.toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();
        return ints;
    }
}
