package solution.leetCode.sortandother;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/24 22:54
 */
public class Q1122 {
    public static void main(String[] args) {
//        int n[] = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
//        sort(n, 0, n.length - 1);
//        System.out.print("快排结果：");
//        for (int m : n) {
//            System.out.print(m + " ");
//        }
        relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] leave = new int[len1];
        int leaveIndex = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : arr2) {
            m.put(n, 0);
        }
        for (int i = 0; i < len1; i++) {
            if (m.containsKey(arr1[i])) {
                m.put(arr1[i], m.get(arr1[i]) + 1);
            } else {
                leave[leaveIndex++] = arr1[i];
            }
        }
        int index = 0;
        for (int h = 0; h < len2; h++) {
            for (int z = 0; z < m.get(arr2[h]); z++) {
                arr1[index++] = arr2[h];
            }
        }
        int t = index;
        for (int n = 0; n < leaveIndex; n++) {
            arr1[index++] = leave[n];
        }
        sort(arr1, t, len1 - 1);

        return arr1;
    }

    public static int[] sort(int a[], int l, int r) {
        if (l >= r) return new int[]{};
        int cur = a[l];
        int i = l, j = r;
        while (i < j) {
            while (i < j && a[j] > cur) j--;
            if (i < j) {
                a[i] = a[j];
                a[j] = cur;
                i++;
            }
            while (i < j && a[i] < cur) i++;
            if (i < j) {
                a[j] = a[i];
                a[i] = cur;
                j--;
            }
        }
        sort(a, l, i - 1);
        sort(a, i + 1, r);
        return a;
    }
}
