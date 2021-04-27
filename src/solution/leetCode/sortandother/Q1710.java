package solution.leetCode.sortandother;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Anjude
 * Date: 2021/4/26 18:07
 */
public class Q1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int len = boxTypes.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (truckSize <= boxTypes[i][0]) {
                sum += truckSize * boxTypes[i][1];
                sum += truckSize * boxTypes[i][1];
                break;
            } else {
                truckSize -= boxTypes[i][0];
                sum += boxTypes[i][0] * boxTypes[i][1];
            }
        }
        return sum;
    }
}
