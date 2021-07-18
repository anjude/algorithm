package solution.jzoffer.day10;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * JZ40  可用方法很多：快排/堆/二叉搜索树/计数排序，此处只写了快排全部排序的
 *
 * @author Anjude
 * @date 2021/7/17 21:05
 */
public class JZ40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length <= k) return arr;
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOfRange(arr, 0, k);
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int standard = arr[l];
        int i = l, j = r;
        while (i < j) {
            // 找到第一个小于基准值的数的下标d（从右往左）
            while (i < j && arr[j] > standard) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                arr[j] = standard;
                i++;
            }
            // 找到第一个大于基准值的数的下标（从左往右）
            while (i < j && arr[i] < standard) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                arr[i] = standard;
                j--;
            }
        }
        quickSort(arr, l, i - 1);
        quickSort(arr, i + 1, r);
    }
}
