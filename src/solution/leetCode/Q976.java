package solution.leetCode;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/24 22:03
 */
public class Q976 {
    public static void main(String[] args) {
        largestPerimeter(new int[]{2, 1, 2});
    }

    public static int largestPerimeter(int[] nums) {
        if (nums == null || nums.length < 3) return 0;
        int len = nums.length;
        int max = -1;
        Arrays.sort(nums);
        for (int i = len - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                max = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }
        return max == -1 ? 0 : max;
    }
}
