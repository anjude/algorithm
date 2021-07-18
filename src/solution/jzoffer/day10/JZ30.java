package solution.jzoffer.day10;

import java.util.ArrayList;
import java.util.List;

/**
 * JZ30  构造一个链表，存储当前最小值，缺少 throws 的代码
 *
 * @author Anjude
 * @date 2021/7/17 23:37
 */
public class JZ30 {

    private List<StackNode> myStack;
    private StackNode top;
    private int size;

    public JZ30() {
        myStack = new ArrayList<>();
    }

    public void push(int x) {
        StackNode stackNode = new StackNode();
        if (top == null || top.min > x) {
            stackNode.min = x;
        } else {
            stackNode.min = top.min;
        }
        stackNode.val = x;
        top = stackNode;
        size++;
        myStack.add(stackNode);
    }

    public void pop() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            myStack = new ArrayList<>();
            top = null;
            size = 0;
        } else {
            top = myStack.get(size - 2);
            myStack.remove(size - 1);
            size--;
        }
    }

    public int top() {
        if (top == null) {
            return -1;
        }
        return top.val;
    }

    public int min() {
        if (top == null) {
            return -1;
        }
        return top.min;
    }

    static class StackNode {
        int val;
        int min;
    }

    public static void main(String[] args) throws Exception {
        JZ30 jz30 = new JZ30();
        jz30.push(-2);
        jz30.push(0);
        jz30.push(-3);
        System.out.println(jz30.min());
        jz30.pop();
        System.out.println(jz30.top());
        System.out.println(jz30.min());

    }
}
