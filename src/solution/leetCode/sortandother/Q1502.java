package solution.leetCode.sortandother;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/26 14:56
 */
public class Q1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int gap = arr[1] - arr[0];
        for (int i = 0; i < len - 1; i++) {
            if (arr[i + 1] - arr[i] != gap)
                return false;
        }
        return true;
    }
}
