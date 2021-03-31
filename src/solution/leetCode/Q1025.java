package solution.leetCode;

/**
 * Created by Anjude
 * Date: 2021/3/31 13:16
 */
public class Q1025 {
    public boolean divisorGame(int N) {
        // 动态规划，有题目又说两个都是最佳状态我这理解就是每次x =1;
        // 那么就有 如果n是爱丽丝赢 那么n-2是爱丽丝赢 状态转移方程 f(n) = !f(n-1)
//        Boolean flag = true;
//        for (int i = 1; i < N+1; i++) {
//            flag = !flag;
//        }
//        return flag;

        boolean[] f = new boolean[N + 5];

        f[1] = false;
        f[2] = true;

        for (int i = 3; i <= N; ++i) {
            for (int j = 1; j < i; ++j) {
                if ((i % j) == 0 && !f[i - j]) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[N];

//        return n % 2 == 0;
    }
}
