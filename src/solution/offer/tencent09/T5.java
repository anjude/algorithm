package solution.offer.tencent09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * T5  有效序列
 *
 * @author Anjude
 * @date 2021/9/5 20:54
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
            res++;
            for (int j = i + 2; j < n; j++) {
                boolean isList = isList(a, i, j);
                if (isList) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    private static boolean isList(int[] a, int i, int j) {
        if (j - i == 1) return true;
        int max = Math.max(a[i], a[j]);
        for (int k = i + 1; k < j; k++) {
            if (a[k] < max) {
                return false;
            }
        }
        return true;
    }
}
