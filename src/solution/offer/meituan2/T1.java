package solution.offer.meituan2;

import java.util.Scanner;

/**
 * T1  ab串，有多少个长度为n的仅由a和b组成的字符串既不包含aba也不包含bab？
 * 如果你算不来大数你可以告诉我这个问题的答案模上998244353是多少
 *
 * @author Anjude
 * @date 2021/9/4 16:01
 */
public class T1 {
    private static String ABA = "aba";
    private static String BAB = "bab";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        if (n <= 2) {
            for (int i = 0; i < n; i++) {
                res *= 2;
            }
            System.out.println(res);
            return;
        }
        if (n == 3) {
            System.out.println(6);
            return;
        }
        res = 6;
        int inc1 = 2;
        int inc2 = 2;
        for (int i = 4; i <= n; i++) {
            int curInc = inc1 + inc2;
            inc1 = inc2;
            inc2 = curInc;
            res += curInc;
        }
        System.out.println(res);
    }
}
