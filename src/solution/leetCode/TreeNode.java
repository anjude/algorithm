package solution.leetCode;

/**
 * Created by Anjude
 * Date: 2021/4/11 13:16
 */
public class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
