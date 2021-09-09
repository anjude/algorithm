package solution.offer.meituan2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * T5  在一个n个数构成的序列中，怎么快速找出切尾平均最大的一个长度为m的连续子区间。在这个问题的切尾平均中，仅去除最大值和最小值。
 *
 * @author Anjude
 * @date 2021/9/4 17:24
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n];
        int curMax = 0;
        int curMaxIndex = 0;
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i < n - m + 1; i++) {
            int sum = 0;
            int min = list[i];
            int max = list[i];
            for (int j = i; j < i + m; j++) {
                int cur = list[j];
                sum += cur;
                min = Math.min(cur, min);
                max = Math.max(cur, max);
            }
            sum = sum - min - max;
            if (sum > curMax) {
                curMax = sum;
                curMaxIndex = i;
            }
        }
        System.out.println(curMaxIndex + 1);
    }
}
