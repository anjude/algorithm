package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/20 17:24
 */
// 归并排序 O(nlogn) O(n) 稳定排序 非原地排序
public class MergeSort {
    static int[] arr = new int[]{8, 5, 2, 6, 9, 3, 4, 1, 7};

    public static void main(String[] args) {
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int a[], int l, int r) {
        if (l >= r) {
            return a;
        }
        int mid = (l + r) / 2;
        a = mergeSort(a, l, mid);
        a = mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
        return a;
    }

    static void merge(int[] a, int l, int mid, int r) {
        int[] tempList = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < a[j]) {
                tempList[k++] = arr[i++];
            } else {
                tempList[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tempList[k++] = arr[i++];
        }
        while (j <= r) {
            tempList[k++] = arr[j++];
        }
        for (int num : tempList) {
            arr[l++] = num;
        }
        //先用一个临时数组把他们合并汇总起来
//        int[] temp = new int[r - l + 1];
//        int i = l;
//        int j = mid + 1;
//        int k = 0;
//        while (i <= mid && j <= r) {
//            if (arr[i] < arr[j]) {
//                temp[k++] = arr[i++];
//            } else {
//                temp[k++] = arr[j++];
//            }
//        }
//        while(i <= mid) temp[k++] = arr[i++];
//        while(j <= r) temp[k++] = arr[j++];
//        // 把临时数组复制到原数组
//        for (i = 0; i < k; i++) {
//            arr[l++] = temp[i];
//        }
    }
}
