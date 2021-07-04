package solution.jzoffer.day2;

/**
 * JZ10  斐波那契数列，题目规定 n = 0，需返回 1
 *
 * @author Anjude
 * @date 2021/7/4 15:40
 */
public class JZ10 {
    public int numWays(int n) {
        if(n < 2) return 1;
        int a = 1, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
