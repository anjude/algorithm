package solution.offer.huya;

import java.util.HashMap;
import java.util.Map;

/**
 * T3  TODO
 *
 * @author Anjude
 * @date 2021/9/9 19:27
 */
public class T3 {
    public boolean ruleMatch(String rule, String s) {
        String[] s1 = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        int charsLen = rule.length();
        for (int i = 0; i < charsLen; i++) {
            char c = rule.charAt(i);
            String cur = map.get(c);
            if (cur != null) {
                if (!s1[i].equals(cur)) {
                    return false;
                }
            } else {
                map.put(c, s1[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new T3().ruleMatch("abba","apple boy boy cat");
    }
}
