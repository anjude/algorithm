package solution.leetCode.tree;

import solution.leetCode.TreeNode;

/**
 * Created by Anjude
 * Date: 2021/4/30 0:32
 */
public class Q104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
