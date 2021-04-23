package test;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/5 13:39
 */
public class TreeDemo {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        preOrder(root);
        System.out.println();
//        inOrder(root);
//        System.out.println();
//        postOrder(root);

        preOrderStack2(root);
        System.out.println();
        postOrderStack(root);
//        inOrder(root);
//        System.out.println();
//        postOrder(root);

    }

    static void preOrderStack(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> q = new Stack<>();
        q.push(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.pop();
            System.out.print(cur.value);
            if (cur.right != null) q.push(cur.right);
            if (cur.left != null) q.push(cur.left);
        }
    }

    static void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 模拟递归栈操作
     *
     * @param root
     */
    static void preOrderStack2(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                System.out.print(root.value);
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            root = root.right;
        }
    }

    static void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.value);
        inOrder(root.right);
    }

    /**
     * 模拟递归栈操作
     *
     * @param root
     */
    static void inOrderStack(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            System.out.print(root.value);
            root = root.right;
        }
    }

    static void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value);
    }

    /**
     * 模拟递归栈操作
     *
     * @param root
     */
    static void postOrderStack(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        Map<TreeNode, Boolean> map = new HashMap<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode cur = s.peek();
            if (cur.left != null && !map.containsKey(cur.left)) {
                cur = cur.left;
                while (cur != null) {
                    if (map.containsKey(cur)) break;
                    else s.push(cur);
                    cur = cur.left;
                }
                continue;
            }
            if (cur.right != null && !map.containsKey(cur.right)) {
                s.push(cur.right);
                continue;
            }
            TreeNode temp = s.pop();
            map.put(temp, true);
            System.out.print(temp.value);
        }
    }

    /**
     * 层序遍历
     *
     * @param root
     */
    static void levelTraverse(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null) q.offer(cur.left);
            if (cur.right != null) q.offer(cur.right);
            System.out.print(cur.value);
        }
    }

}

class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode(int v) {
        this.value = v;
    }
}