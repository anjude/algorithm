package solution.leetCode.sortandother;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anjude
 * Date: 2021/4/5 10:21
 */
public class Q3 {
    //    文字版实现：定义两个指针，一个左指针，一个右指针，从长串开头，先移动右指针，获取一个字符，如果“窗口”（即两指针间）里没有重复的字符，继续向右移右指针；直到遇上“窗口”中已包含的字符，右指针等待；开始移动左指针，每移动一次，看看现“窗口”中是否还包含右指针所指的字符；直到“窗口”中没有右指针所指字符，就停止移动左指针，接着继续移动右指针。重复以上步骤，直到有一个指针（一般是右指针）移动到长串边界，结束。在这个过程中随时记录“窗口”最大时的情况，即是我们的答案
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> strSet = new HashSet<>();
        while (right < s.length() && left < s.length()) {
            // 如果存在字符，移除，左指针右移
            if (strSet.contains(s.charAt(right))) {
                strSet.remove(s.charAt(left));
                left++;
            } else {
                strSet.add(s.charAt(right));
                right++;
            }
            if (max < strSet.size()) {
                max = strSet.size();
            }
        }
        return max;
    }

    public int official(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
