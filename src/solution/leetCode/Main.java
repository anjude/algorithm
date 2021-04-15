package solution.leetCode;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Anjude
 * Date: 2021/3/31 13:34
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode root = treeNode;
        for (int i = 2; i < 9; i++) {
            if (i % 2 == 0) {
                root.right = new TreeNode(i);
            } else {
                root.left = new TreeNode(i);
                root = root.left;
            }
        }

        Q100 a = new Q100();
        System.out.println(a.isSameTree(treeNode, treeNode));


//        Q76 a = new Q76();
//        System.out.println(a.minWindow("ADOBECODEBANC", "ABC"));

//        ListNode L1 = new ListNode(1);
//        L1.next = new ListNode(2);
//        Q24 r = new Q24();
//        r.swapPairs(L1);

//        Q3 a = new Q3();
//        System.out.println(a.lengthOfLongestSubstring("pwwkew"));

//        Q8 a = new Q8();
//        System.out.println(a.myAtoi("345-d"));

//        Q206 a = new Q206();
//        ListNode nodeSta = new ListNode(0);    //创建首节点
//        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
//        nextNode = nodeSta;                      //指向首节点
//
//        //创建链表
//        for (int i = 1; i < 10; i++) {
//            ListNode node = new ListNode(i);  //生成新的节点
//            nextNode.next = node;               //把心节点连起来
//            nextNode = nextNode.next;           //当前节点往后移动
//        }
//        //当for循环完成之后 nextNode指向最后一个节点
//        System.out.println(a.reverseList(nodeSta));


//        Q303 a = new Q303();
//        System.out.println(a.sumRange(1, 1));

//        Q1025 a = new Q1025();
//        System.out.println(a.divisorGame(12));
    }
}

