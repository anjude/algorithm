package solution.leetCode.tree;

import solution.leetCode.TreeNode;

/**
 * Created by Anjude
 * Date: 2021/5/1 0:46
 */
public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }
}
