package solution.leetCode;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/23 1:09
 */
public class Q198 {
    public static void main(String[] args) {
        int[] a = new int[]{114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240};
        int b = rob2(a);
        System.out.println(Arrays.toString(a) + b);
    }

    public static int rob2(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
        int len = nums.length;
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[len - 1];
    }

    public static int rob1(int[] nums) {
        return dp(nums, 0);
    }

    public static int dp(int[] nums, int start) {
        if (start >= nums.length) {
            return 0;
        }
        int res = Math.max(
                dp(nums, start + 1),
                dp(nums, start + 2) + nums[start]
        );
        return res;
    }

    public static int rob(int[] nums) {
        int[][] arr = new int[nums.length + 1][nums.length + 1];
        int[] Is = new int[nums.length + 1];
        for (int x = 1; x < arr.length; x++) {
            // 复制上一行的值
            for (int y = 1; y < x; y++) {
                arr[x][y] = arr[x - 1][y];
            }
            // 获取上一个房子最大收益
            int max = arr[x][x - 1];
            // 如果上一个房子没偷
            if (Is[x - 1] == 0) {
                // 如果上一个最优解加上这次比上一个房子最大收益大，偷了
                if (max < arr[x - 1][x - 1] + nums[x - 1]) {
                    Is[x] = 1;
                    max = arr[x - 1][x - 1] + nums[x - 1];
                }

            } else {
                // 如果上一个房子被偷
                // 上一个最优解 < 上上个最优解 - 上一个房子的金额 + 当前房子金额
                if (max < arr[x - 1][x - 1 - 1] + nums[x - 1]) {
                    Is[x] = 1;
                    Is[x - 1] = 0;
                    max = arr[x - 1][x - 1 - 1] + nums[x - 1];
                }
            }
            // 获取到最大值
            arr[x][x] = max;
        }

        return arr[arr.length - 1][arr.length - 1];
    }

}
