package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/17 11:14
 */
public class Main {

    public static int[] array = {345, 234, 13, 56, 45, 67, 32, 45, 63, 7, 6, 2, 4, 7, 9, 1, 3, 8, 5};

    /**
     * 递归排序
     */
    public static void sort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int key = arr[begin];
        int i = begin;
        int j = end;
        while (i < j) {
            while (i < j && arr[j] > key) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                arr[j] = key;
                i++;
            }
            while (i < j && arr[i] < key) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                arr[i] = key;
                j--;
            }
        }
        sort(arr, begin, i - 1);
        sort(arr, i + 1, end);
    }

    public static void main(String[] args) {
        sort(array, 0, array.length - 1);
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}