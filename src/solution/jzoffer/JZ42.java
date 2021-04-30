package solution.jzoffer;

/**
 * Created by Anjude
 * Date: 2021/4/29 1:28
 */
public class JZ42 {
    public static void main(String[] args) {
        maxSubArray(new int[]{-2, 1});
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i - 1], nums[i - 1]);
        }
        int res = dp[1];
        for (int i = 0; i < n; i++) {
            if (res < dp[i]) {
                res = dp[i];
            }
        }

        return res;
    }
}
