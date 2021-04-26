package solution.leetCode.sortandother;

import java.util.Stack;

/**
 * Created by Anjude
 * Date: 2021/4/5 11:40
 */
public class Q20 {
    public boolean isValid(String s) {
        Stack<Character> sign = new Stack<>();
        sign.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(sign.size() == 0){
                sign.push(s.charAt(i));
                continue;
            }
            if ((sign.lastElement() == '(' && s.charAt(i) == ')') ||
                    (sign.lastElement() == '{' && s.charAt(i) == '}') ||
                    (sign.lastElement() == '[' && s.charAt(i) == ']')
            ) {
                sign.pop();
            } else {
                sign.push(s.charAt(i));
            }
        }
        return sign.size() == 0;
    }
}
