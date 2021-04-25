package solution.leetCode;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/26 0:13
 */
public class Q1370 {
    public static void main(String[] args) {
        System.out.println(sortString("leetcode"));
    }

    public static String sortString(String s) {
        String res = "";
        Map<Character, Integer> sMap = new TreeMap<>();
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        Object[] keySet = sMap.keySet().toArray();
        while (count > 0) {
            for (int i = 0; i < keySet.length; i++) {
                char c = (char) keySet[i];
                if (sMap.get(c) > 0) {
                    res += c;
                    count--;
                    sMap.put(c, sMap.get(c) - 1);
                }
            }
            for (int j = keySet.length - 1; j >= 0; j--) {
                char c = (char) keySet[j];
                if (sMap.get(c) > 0) {
                    res += keySet[j];
                    sMap.put(c, sMap.get(c) - 1);
                    count--;
                }
            }
        }

        return res;
    }
    public String sortString1(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer ret = new StringBuffer();
        while (ret.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (num[i] > 0) {
                    ret.append((char) (i + 'a'));
                    num[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (num[i] > 0) {
                    ret.append((char) (i + 'a'));
                    num[i]--;
                }
            }
        }
        return ret.toString();
    }
}
