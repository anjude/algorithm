package solution.offer.meituan2;

import java.util.Scanner;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/9/4 16:04
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                map[i][j] = 1;
            }
        }
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j){
                    continue;
                }
                if(map[i][j] == 1){

                }
            }
        }
        System.out.println("0 1 2");
        System.out.println("1 0 1");
        System.out.println("2 1 0");
    }
}
