package solution.offer.meituan;

import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/18 10:24
 */
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] attA = new int[n];
        int[] numA = new int[n];
        int[] attB = new int[m];
        int[] numB = new int[m];

        for (int i = 0; i < n; i++) {
            numA[i] = in.nextInt();
            attA[i] = in.nextInt();
        }
        for (int j = 0; j < m; j++) {
            numB[j] = in.nextInt();
            attB[j] = in.nextInt();
        }

        int sumA = 0, sumB = 0;
        for (int i = 0; i < n; i++) {
            if (attA[i] >= k) {
                sumA = sumA + attA[i] * numA[i];
            }
        }
        for (int i = 0; i < m; i++) {
            if (attB[i] >= k) {
                sumB = sumB + attB[i] * numB[i];
            }
        }
        char res = sumA - sumB > 0 ? 'A' : 'B';
        System.out.println(sumA + " " + sumB + "\n" + res);
    }
}
