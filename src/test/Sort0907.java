package test;

import java.util.Arrays;

/**
 * Sort0907  快排
 *
 * @author Anjude
 * @date 2021/9/7 18:37
 */
public class Sort0907 {
    public static void sort(int[] list, int l, int r) {
        if (l >= r) {
            return;
        }
        int key = list[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && list[j] > key) {
                j--;
            }
            if (i < j) {
                list[i] = list[j];
                list[j] = key;
                i++;
            }
            while (i < j && list[i] < key) {
                i++;
            }
            if (i < j) {
                list[j] = list[i];
                list[i] = key;
                j--;
            }
            System.out.println("aaa");
        }
        System.out.println("bbb");
        sort(list, l, i - 1);
        sort(list, i + 1, r);
        System.out.println("ccc");
    }

    public static void main(String[] args) {
        int[] list = new int[]{4, 5, 6, 3, 8, 7};
        int len = list.length;
        sort(list, 0, len - 1);
        System.out.println(Arrays.toString(list));
    }
}
