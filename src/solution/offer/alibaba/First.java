package solution.offer.alibaba;

import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/26 19:01
 */
public class First {

    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = -1;
        int n = in.nextInt();
        int m = in.nextInt();
        int x1 = in.nextInt() - 1;
        int y1 = in.nextInt() - 1;
        int x2 = in.nextInt() - 1;
        int y2 = in.nextInt() - 1;
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                map[i][j] = in.nextInt();
        }
        res = go(map, x1, y1, x2, y2);

        System.out.println(res == -1 ? -1 : res + 1);
    }

    public static int go(int[][] map, int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 1;
        }
        int cur = map[x1][y1];
        int n = map.length;
        int m = map[0].length;

        if (x1 > 0 && cur >= map[x1 - 1][y1]) {
            count += go(map, x1 - 1, y1, x2, y2);
        }
        if (y1 > 0 && cur >= map[x1][y1 - 1]) {
            count += go(map, x1, y1 - 1, x2, y2);
        }
        if (y1 < n && cur >= map[x1][y1 + 1]) {
            count += go(map, x1, y1 + 1, x2, y2);
        }
        if (x1 < m && cur >= map[x1 + 1][y1]) {
            count += go(map, x1 + 1, y1, x2, y2);
        }
        return count;
    }
}
