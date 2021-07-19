package solution.jzoffer.day13;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

/**
 * JZ39  TODO
 * 这里直接用了哈希方法，还有很多很秀的解法可自行研究
 *
 * @author Anjude
 * @date 2021/7/19 22:56
 */
public class JZ39 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int len = nums.length;
        for (int n : nums) {
            int curTimes = numMap.getOrDefault(n, 0);
            if (curTimes > len / 2) {
                return n;
            }
            numMap.put(n, curTimes + 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        JZ39 jz39 = new JZ39();
        System.out.println(jz39.majorityElement(new int[]{2, 3, 4, 2}));
    }
}
