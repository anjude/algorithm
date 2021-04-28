package solution.leetCode.dp;

/**
 * Created by Anjude
 * Date: 2021/4/29 0:34
 */
public class Q746 {
    public static void main(String[] args) {
        minCostClimbingStairs(new int[]{10, 15, 10});
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(cost[i] + dp[i - 1], cost[i] + dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
