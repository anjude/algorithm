package solution.offer.huya;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/9/9 19:22
 */
public class T2 {
    public int calBallTypeNum(int[] balls) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = balls.length;
        for (int ball : balls) {
            map.put(ball, map.getOrDefault(ball, 0) + 1);
        }
        Set<Integer> set = map.keySet();
        int len = set.size();
        return Math.min(len, size / 2);
    }
}
