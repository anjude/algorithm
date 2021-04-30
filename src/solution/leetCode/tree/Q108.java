package solution.leetCode.tree;

import solution.leetCode.TreeNode;

/**
 * Created by Anjude
 * Date: 2021/4/30 0:41
 */
public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if (n == 1) return new TreeNode(nums[0]);
        return bstTree(nums, 0, n - 1);
    }

    public static TreeNode bstTree(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        int num = nums[mid];
        TreeNode root = new TreeNode(num);
        root.left = bstTree(nums, l, mid - 1);
        root.right = bstTree(nums, mid + 1, r);
        return root;
    }
}
