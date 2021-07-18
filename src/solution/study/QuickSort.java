package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/17 2:39
 */
//public class QuickSort {
//
//    public static void main(String[] args) {
//        int n[] = {6, 5, 2, 7, 3, 9, 8, 4, 10, 1};
//        sort(n, 0, n.length - 1);
//        System.out.print("快排结果：");
//        for (int m : n) {
//            System.out.print(m + " ");
//        }
//    }
//
//    public static void sort(int n[], int l, int r) {
//        if (l < r) {
//            // 一趟快排，并返回交换后基数的下标
//            int index = patition(n, l, r);
//            // 递归排序基数左边的数组
//            sort(n, l, index - 1);
//            // 递归排序基数右边的数组
//            sort(n, index + 1, r);
//        }
//
//    }
//
//    public static int patition(int n[], int l, int r) {
//        // p为基数，即待排序数组的第一个数
//        int p = n[l];
//        int i = l;
//        int j = r;
//        while (i < j) {
//            // 从右往左找第一个小于基数的数
//            while (n[j] >= p && i < j) {
//                j--;
//            }
//            // 从左往右找第一个大于基数的数
//            while (n[i] <= p && i < j) {
//                i++;
//            }
//            // 找到后交换两个数
//            swap(n, i, j);
//        }
//        // 使划分好的数分布在基数两侧
//        swap(n, l, i);
//        return i;
//    }
//
//    private static void swap(int n[], int i, int j) {
//        int temp = n[i];
//        n[i] = n[j];
//        n[j] = temp;
//    }
//}


public class QuickSort {

    public static int[] array = {3, 2, 5, 1, 5, 3, 6, 2, 5, 345, 23, 12, 6345, 2341, 2143, 234, 645, 134};

    public QuickSort() {
    }

    /**
     * 递归排序
     */
    public void sort(int[] arr, int begin, int end) {
        if (begin >= end) return;
        int cur = arr[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            // 找到右边第一个小于基准值的下标
            while (i < j && arr[j] > cur) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                arr[j] = cur;
                // 本次循环arr[i]的值已放至正确位置，指针右移
                i++;
            }
            // 找到左边第一个大于基准值的下标
            while (i < j && arr[i] < cur) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                arr[i] = cur;
                // 本次循环arr[j]的值已放至正确位置，指针左移
                j--;
            }
        }
        sort(arr, begin, i - 1);
        sort(arr, i + 1, end);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}