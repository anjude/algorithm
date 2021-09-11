package solution.study;

import solution.leetCode.TreeNode;

import java.util.ArrayList;

/**
 * T  TODO
 *
 * @author Anjude
 * @date 2021/9/11 17:10
 */
public class T {
    ArrayList<Integer> list = new ArrayList<>();

    public void k(int N, TreeNode root) {
        find(root);
        Integer integer = list.get(N - 1);
        System.out.println(integer);
    }

    private void find(TreeNode root) {
        if (root != null) {
            find(root.left);
            list.add(root.val);
            find(root.right);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        while (true) {
            if(n % 2 != 0){
                System.out.println("不是幂次方");
                break;
            }
            n /= 2;
        }
        if (n != 1) {
            System.out.println("不是幂次方");
        }
    }

}
