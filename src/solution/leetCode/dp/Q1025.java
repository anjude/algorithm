package solution.leetCode.dp;

/**
 * Created by Anjude
 * Date: 2021/4/29 0:55
 */
public class Q1025 {
    public boolean divisorGame(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        boolean[] dp = new boolean[n + 1];
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                // 如果能把数回到她会输的节点，那么因为下一手不是她先，她会赢
                if (i % j == 0 && !dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}