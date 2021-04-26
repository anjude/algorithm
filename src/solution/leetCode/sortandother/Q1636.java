package solution.leetCode.sortandother;

import com.sun.deploy.trace.Trace;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Anjude
 * Date: 2021/4/26 15:35
 */
public class Q1636 {
    public static void main(String[] args) {
        frequencySort(new int[]{2, 2, 4, 3, 3});
    }

    public static int[] frequencySort(int[] nums) {
        int[] fre = new int[201];
        int len = nums.length;
        for (int n : nums)
            fre[n + 100]++;
        for (int i = 0; i < len; i++) {
            nums[i] = fre[nums[i] + 100] * 1000 - nums[i] + 100;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            nums[i] = 100 - nums[i] % 1000;
        }
        return nums;
    }
}
