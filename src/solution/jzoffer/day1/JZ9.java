package solution.jzoffer.day1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * JZ9  相当于两个栈，尾尾相连，一个栈负责push，一个栈负责pop
 *
 * @author Anjude
 * @date 2021/7/4 2:21
 */
public class JZ9 {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public JZ9() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            // 把stack1元素转移到stack2，实现逆序，pop的时候，刚好符合队列先进先出的原则
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
    }
}


























