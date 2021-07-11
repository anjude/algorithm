package solution.jzoffer.day7;

import java.util.Arrays;

/**
 * JZ21  双指针
 *
 * @author Anjude
 * @date 2021/7/11 21:53
 */
public class JZ21 {
    public int[] exchange(int[] nums) {
        if (nums == null) return null;
        int len = nums.length;
        int h = len - 1;
        int l = 0;
        while (l < h) {
            if (nums[l] % 2 == 0) {
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;
                h--;
            } else {
                l++;
            }
        }
        return nums;
    }
}
