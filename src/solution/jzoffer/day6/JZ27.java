package solution.jzoffer.day6;

import solution.leetCode.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * JZ27  递归求解
 *
 * @author Anjude
 * @date 2021/7/11 18:11
 */
public class JZ27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTree(root.right);
        mirrorTree(root.left);
        return root;
    }
}
