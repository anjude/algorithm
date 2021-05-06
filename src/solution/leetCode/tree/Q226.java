package solution.leetCode.tree;

import solution.leetCode.TreeNode;

/**
 * Created by Anjude
 * Date: 2021/5/1 1:22
 */
public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode l = root.left;
        root.left = root.right;
        root.right = l;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
