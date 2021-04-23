package solution.jzoffer;

import java.util.Stack;

/**
 * Created by Anjude
 * Date: 2021/4/19 22:23
 */
public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.size() == 0) {
            return -1;
        }
        int res = -1;
        while (stack1.size() != 1) {
            stack2.push(stack1.pop());
        }
        while (stack2.size() != 0) {
            stack1.push(stack2.pop());
        }
        res = stack2.pop();
        return res;
    }
}
