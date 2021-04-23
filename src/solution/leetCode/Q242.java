package solution.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anjude
 * Date: 2021/4/23 17:30
 */
public class Q242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int len = s.length();
        Map<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < len; i++) {
            Character curS = s.charAt(i);
            Character curT = t.charAt(i);
            mapS.put(curS, mapS.getOrDefault(curS, 0) + 1);
            mapS.put(curT, mapS.getOrDefault(curT, 0) - 1);
        }
        for (int n : mapS.values()) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
