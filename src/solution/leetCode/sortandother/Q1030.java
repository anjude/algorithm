package solution.leetCode.sortandother;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Anjude
 * Date: 2021/4/24 22:16
 */
public class Q1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[index++] = new int[]{i, j};
            }
        }
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int a = Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0);
                int b = Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0);
                return a - b;
            }
        });
        return res;
    }
}
