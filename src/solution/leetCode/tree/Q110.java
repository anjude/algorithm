package solution.leetCode.tree;

import solution.leetCode.TreeNode;

/**
 * Created by Anjude
 * Date: 2021/4/30 1:10
 */
public class Q110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int level = help(root);
        return level >= 0;
    }

    public static int help(TreeNode root) {
        if (root == null) return 0;
        int lh = help(root.left);
        int rh = help(root.right);
        if (lh >= 0 && rh >= 0 && Math.abs(lh - rh) <= 1) {
            return Math.max(lh, rh) + 1;
        } else {
            return -1;
        }
    }

    //这个ReturnNode是参考我描述的递归套路的第二步：思考返回值是什么
    //一棵树是BST等价于它的左、右俩子树都是BST且俩子树高度差不超过1
    //因此我认为返回值应该包含当前树是否是BST和当前树的高度这两个信息
    private class ReturnNode{
        boolean isB;
        int depth;
        public ReturnNode(int depth, boolean isB){
            this.isB = isB;
            this.depth = depth;
        }
    }
    //主函数
    public boolean isBalanced1(TreeNode root) {
        return isBST(root).isB;
    }
    //参考递归套路的第三部：描述单次执行过程是什么样的
    //这里的单次执行过程具体如下：
    //是否终止?->没终止的话，判断是否满足不平衡的三个条件->返回值
    public ReturnNode isBST(TreeNode root){
        if(root == null){
            return new ReturnNode(0, true);
        }
        //不平衡的情况有3种：左树不平衡、右树不平衡、左树和右树差的绝对值大于1
        ReturnNode left = isBST(root.left);
        ReturnNode right = isBST(root.right);
        if(left.isB == false || right.isB == false){
            return new ReturnNode(0, false);
        }
        if(Math.abs(left.depth - right.depth) > 1){
            return new ReturnNode(0, false);
        }
        //不满足上面3种情况，说明平衡了，树的深度为左右俩子树最大深度+1
        return new ReturnNode(Math.max(left.depth, right.depth) + 1, true);
    }
}
