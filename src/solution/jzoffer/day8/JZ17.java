package solution.jzoffer.day8;

import java.util.ArrayList;
import java.util.List;

/**
 * JZ17  暴力求解，未考虑大数问题
 *
 * @author Anjude
 * @date 2021/7/12 21:53
 */
public class JZ17 {
    public int[] printNumbers(int n) {
        int limit = (int) Math.pow(10, n);
        int[] res = new int[limit - 1];
        for (int i = 0; i < limit - 1; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
