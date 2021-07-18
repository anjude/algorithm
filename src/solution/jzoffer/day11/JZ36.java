package solution.jzoffer.day11;


/**
 * JZ36  中序遍历
 *
 * @author Anjude
 * @date 2021/7/18 17:13
 */
public class JZ36 {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != null) pre.right = root;
        else head = root;
        root.left = pre;
        pre = root;
        dfs(root.right);
    }


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

}
