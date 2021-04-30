package solution.leetCode.dp;

/**
 * Created by Anjude
 * Date: 2021/4/29 1:16
 */
public class V0801 {
    public static void main(String[] args) {
        waysToStep(61);
    }

    public static int waysToStep(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000007;
        }
        return (int) dp[n - 1];
    }
}
