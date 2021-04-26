package solution.leetCode.sortandother;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/26 15:03
 */
public class Q1528 {
    public static void main(String[] args) {
        restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
    }

    public static String restoreString(String s, int[] indices) {
        int len = s.length();
        char[] chList = new char[len];
        for (int i = 0; i < len; i++) {
            chList[indices[i]] = s.charAt(i);
        }
        return new String(chList);
    }
}
