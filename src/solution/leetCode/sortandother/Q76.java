package solution.leetCode.sortandother;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anjude
 * Date: 2021/4/5 15:45
 */
public class Q76 {
    /**
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 输出："BANC"
     *
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (s == null || t == null || sLen < tLen || sLen == 0 || tLen == 0) {
            return "";
        }
        int[] have = new int[128];
        int[] need = new int[128];

        // 把需要的频数存起来
        for (int i = 0; i < tLen; i++) {
            need[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        int min = sLen + 1;
        int start = 0;
        int match = 0;
        // 当右指针到达终点，停止循环
        while (right < sLen) {
            char c = s.charAt(right);
            if (need[c] == 0) {
                right++;
                continue;
            }
            if (have[c] < need[c]) {
                match++;
            }
            have[c]++;
            right++;
            // 找到[left,right)中刚好符合要求的字串
            while (match == tLen) {
                if (right - left < min) {
                    start = left;
                    min = right - left;
                }
                // 左指针移位，维护match个数
                char l = s.charAt(left);
                if (need[l] == 0) {
                    left++;
                    continue;
                }
                if (have[l] == need[l]) {
                    match--;
                }
                have[l]--;
                left++;
            }
        }
        if (min == sLen + 1) {
            return "";
        }

        return s.substring(start, start + min);
    }
}
