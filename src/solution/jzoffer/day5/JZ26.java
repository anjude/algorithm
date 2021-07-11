package solution.jzoffer.day5;

import solution.leetCode.TreeNode;

/**
 * JZ26  TODO
 *
 * @author Anjude
 * @date 2021/7/11 17:55
 */
public class JZ26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean dfs(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null) return false;
        return a.val == b.val && dfs(a.left, b.left) && dfs(a.right, b.right);
    }
}















