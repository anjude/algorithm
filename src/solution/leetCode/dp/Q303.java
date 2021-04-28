package solution.leetCode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anjude
 * Date: 2021/4/28 0:48
 */
public class Q303 {
    public static void main(String[] args) {
        Q303 numArray = new Q303(new int[]{-2, 0, 3, -5, 2, -1});
        numArray.sumRange(0, 2); // return 1 ((-2) + 0 + 3)
        numArray.sumRange(2, 5); // return -1 (3 + (-5) + 2 + (-1))
        numArray.sumRange(0, 5); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))
    }

    private int[] nums;
    private int[] sums;

    public Q303(int[] nums) {
        this.nums = nums;
    }
    public Q303(int[] nums, int j) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange1(int i, int j) {
        return sums[j + 1] - sums[i];
    }

    public int sumRange(int left, int right) {
        int res = 0;
        for (int i = left; i < right + 1; i++) {
            res += nums[i];
        }
        return res;
    }
}
