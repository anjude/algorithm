package solution.offer.huya;

import java.util.HashMap;
import java.util.Map;

/**
 * T5  TODO
 *
 * @author Anjude
 * @date 2021/9/9 20:03
 */
public class T5 {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int times = map.getOrDefault(c, 0);
            if (times == 0) {
                sb.append(c);
                map.put(c, 1);
            }
        }
        return sb.toString();
    }
}
