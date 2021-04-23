package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/19 0:19
 * 双指针找两数之和，顺序数组
 */
public class TwoPoint {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ret = twoPoint(nums, 17);
        System.out.println(Arrays.toString(ret));
        Math.max(1, 2);
    }

    private static int[] twoPoint(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            if (nums[low] + nums[high] == target) {
                return new int[]{low, high};
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else if (nums[low] + nums[high] > target) {
                high--;
            }
        }
        return new int[]{0};
    }
}
