package solution.jzoffer.day13;

import solution.leetCode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * JZ32two  TODO
 *
 * @author Anjude
 * @date 2021/7/20 0:07
 */
public class JZ32two {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> res = new ArrayList<>();
//        while(queue.isEmpty()){
//
//        }
        return null;
    }
}
