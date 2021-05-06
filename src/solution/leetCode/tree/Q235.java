package solution.leetCode.tree;

import solution.leetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/5/2 0:59
 */
public class Q235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        while (true) {
            if (res.val > p.val && res.val > q.val) {
                res = res.left;
            } else if (res.val < p.val && res.val < q.val) {
                res = res.right;
            } else {
                break;
            }
        }
        return res;
    }
}
