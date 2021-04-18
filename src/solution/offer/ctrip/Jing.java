package solution.offer.ctrip;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/16 21:50
 */
public class Jing {
    public static String result = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int data;
        try {
            data = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("N");
            return;
        }
        if (data < 1 || data > 12) {
            System.out.println("0");
        }
        ArrayList<Tree> queue = new ArrayList<Tree>();
        Tree tree = new Tree();
        tree.data = "R";
        queue.add(tree);
        int height = 1;
        while (data > 1) {
            for (int x = 0; x < height; x++) {
                Tree node = queue.get(0);
                queue.remove(0);
                Tree left = new Tree();
                Tree right = new Tree();
                left.data = "G";
                right.data = "R";
                node.left = left;
                node.right = right;
                queue.add(left);
                queue.add(right);

            }
            height *= 2;
            data--;
        }

        ForTheTree(tree);
        System.out.println(result);
    }

    private static void ForTheTree(Tree tree) {
        if (tree != null) {
            if (tree.left != null) {
                ForTheTree(tree.left);
                result += tree.data;
                ForTheTree(tree.right);
            } else {
                result += tree.data;
            }

        }
    }
}


class Tree {
    Tree right;
    Tree left;
    String data;
}
