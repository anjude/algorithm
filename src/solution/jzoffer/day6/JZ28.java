package solution.jzoffer.day6;

import solution.leetCode.TreeNode;

/**
 * JZ28  比较左右子树
 *
 * @author Anjude
 * @date 2021/7/11 18:27
 */
public class JZ28 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}






