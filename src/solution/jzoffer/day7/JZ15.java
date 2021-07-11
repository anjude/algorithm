package solution.jzoffer.day7;

/**
 * JZ15  位运算
 *
 * @author Anjude
 * @date 2021/7/11 22:05
 */
public class JZ15 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}
