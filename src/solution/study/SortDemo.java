package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/20 15:02
 */
public class SortDemo {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(selectSort(new int[]{8, 5, 2, 6, 9, 3, 4, 1, 7})));
//        System.out.println(Arrays.toString(insertSort(new int[]{8, 5, 2, 6, 9, 3, 4, 1, 7})));
//        System.out.println(Arrays.toString(bubbleSort(new int[]{8, 5, 2, 6, 9, 3, 4, 1, 7})));
        System.out.println(Arrays.toString(shellSort(new int[]{8, 5, 2, 6, 9, 3, 4, 1, 7})));
    }

    // 希尔排序 非稳定 原地 O(nlogn) O(1)
    static int[] shellSort(int[] a) {
        if (a == null || a.length < 2) return a;
        int len = a.length;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int j = i;
                int cur = a[i];
                while (j - gap >= 0 && a[j - gap] > cur) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = cur;
            }
        }
        return a;
    }

    // 选择排序 稳定排序 原地排序 O(n2) Q(1)
    static int[] bubbleSort(int[] a) {
        if (a == null || a.length < 2) return a;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    flag = false;
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            // 如果不触发排序，说明已经排好了
            if (flag)
                break;
        }
        return a;
    }

    // 插入排序 稳定排序 原地排序 O(n2) Q(1)
    static int[] insertSort(int[] a) {
        int len = a.length;
        if (a == null || len < 2) return a;
        for (int i = 1; i < len; i++) {
            int cur = a[i];
            int j = i - 1;
            while (j >= 0 && cur < a[j]) {
                j--;
            }
            for (int z = i; z > j + 1; z--) {
                a[z] = a[z - 1];
            }
            a[j + 1] = cur;
        }
        return a;
    }

    // 选择排序 非稳定排序，原地排序 O(n2) Q(1)
    static int[] selectSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
