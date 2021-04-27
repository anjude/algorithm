package solution.leetCode.dp;

/**
 * Created by Anjude
 * Date: 2021/4/28 0:35
 */
public class Q121 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int res = 0;
        for (int n : prices) {
            res = Math.max(n - min, res);
            min = Math.min(n, min);
        }
        return res;
    }


}
