package solution.jzoffer.day8;

/**
 * JZ16  快速幂
 *
 * @author Anjude
 * @date 2021/7/12 20:38
 */
public class JZ16 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        JZ16 jz16 = new JZ16();
        jz16.myPow(2.0, 10);
    }
}

















