package solution.offer.tencent09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/9/5 20:16
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        changeRes(a, n);
        changeRes(b, n);
        Arrays.sort(a);
        Arrays.sort(b);
        int aIndex = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curB = b[i];
            boolean has = false;
            for (int j = aIndex; j < n; j++) {
                int curA = a[j];
                if (curA > curB) {
                    res++;
                    has = true;
                    aIndex = j + 1;
                    break;
                }
            }
            if (!has) break;
        }
        System.out.println(res);
    }

    private static void changeRes(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int cur = a[i];
            if (cur == 1) {
                a[i] = 1;
                continue;
            }
            int sqrt = (int) Math.floor(Math.sqrt(cur));
            int res = 2;
            for (int j = 2; j <= sqrt; j++) {
                if (j * j == cur) {
                    res += 1;
                    continue;
                }
                if (cur % j == 0) {
                    res += 2;
                }
            }
            a[i] = res;
        }
    }
}
