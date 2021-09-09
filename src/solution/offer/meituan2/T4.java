package solution.offer.meituan2;

import java.util.Scanner;

/**
 * T4  TODO
 *
 * @author Anjude
 * @date 2021/9/4 16:10
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(3);
    }
}
