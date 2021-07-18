package solution.jzoffer.day11;

import java.util.Stack;

/**
 * JZ31  模拟出栈
 *
 * @author Anjude
 * @date 2021/7/18 19:09
 */
public class JZ31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int len = popped.length;
        for (int num : pushed) {
            stack.push(num);
            while (stack.size() != 0 && i < len && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        JZ31 jz31 = new JZ31();
        jz31.validateStackSequences(new int[]{1, 0}, new int[]{1, 0});
    }
}
