package solution.leetCode.tree;

import solution.leetCode.TreeNode;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/29 2:15
 */
public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        return cmp(root.left, root.right);
    }

    public boolean cmp(TreeNode l, TreeNode r) {
        if (l == null || r == null) {
            return l == r;
        }
        if (l == null || r == null || l.val != r.val) {
            return false;
        }
        return cmp(l.right, r.left) && cmp(l.left, r.right);
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.right);
        q.offer(root.left);
        while (q.size() != 0) {
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            if (l == null && r == null) continue;
            if (l == null || r == null || r.val != l.val) {
                return false;
            }
            q.offer(l.right);
            q.offer(r.left);
            q.offer(l.left);
            q.offer(r.right);
        }
        return true;
    }
}
