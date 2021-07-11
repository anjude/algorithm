package solution.jzoffer.day5;

/**
 * JZ14  对结果取余，尽量分为等量的3
 *
 * @author Anjude
 * @date 2021/7/11 9:45
 */
public class JZ14 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int b = n % 3, p = 1000000007;
        long res = 1;
        while (n > 4) {
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }
}











