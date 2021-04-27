package solution.leetCode.dp;

/**
 * Created by Anjude
 * Date: 2021/4/26 22:08
 */
public class Q53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }


//    public static int maxSubArray(int[] nums) {
//    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        int preSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preSum = Math.max(nums[i], preSum + nums[i]);
            max = Math.max(preSum, max);
        }
        return max;
    }
}
