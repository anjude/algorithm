package solution.leetCode.greedy;

import test.Greedy;

import java.util.concurrent.ForkJoinPool;

/**
 * Q134  TODO
 *
 * @author Anjude
 * @date 2021/9/9 23:00
 */
public class Q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0, totalSum = 0, st = 0;
        int size = gas.length;
        for (int i = 0; i < size; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                curSum = 0;
                st = i + 1;
            }
        }
        if (totalSum < 0) return -1;
        return st;


//        int n = gas.length;
//        for (int i = 0; i < n; i++) {
//            int curGas = gas[i];
//            for (int j = 0; j < n + 1; j++) {
//                curGas = curGas - cost[(i + j) % n];
//                if (curGas < 0) {
//                    break;
//                } else {
//                    curGas += gas[(i + j + 1) % n];
//                }
//                if (j == n) {
//                    return i;
//                }
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int i = new Q134().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        System.out.println(i);
    }
}
