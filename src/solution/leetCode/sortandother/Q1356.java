package solution.leetCode.sortandother;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/25 0:21
 */
public class Q1356 {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }
        Arrays.sort(arr);
        for (int j = 0; j < len; j++) {
            arr[j] %= 10001;
        }
        return arr;
    }
}
