package solution.jzoffer.day1;

/**
 * JZ10 更新前两个数，暂存相加值用于更新
 *
 * @author Anjude
 * @date 2021/7/4 14:18
 */
public class JZ10 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        // 从 n = 2 开始
        int fib1 = 1, fib2 = 1, sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = (fib1 + fib2) % 1000000007;
            fib1 = fib2;
            fib2 = sum;
        }
        return fib1;
    }
}
