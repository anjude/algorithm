package solution.study;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/17 11:14
 */
public class Main {


    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer a2 = new Integer(1);
        int b = 1;
        int c = 128;
        Integer d = new Integer(128);

        Integer e = 128;
        Integer f = 128;

        System.out.println(a == b);
        System.out.println(a == a2);
        System.out.println(c == d);
        System.out.println(e == f);

//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(System.identityHashCode(c));
//        System.out.println(System.identityHashCode(d));


//        int[] n = {6, 5, 2, 7, 3, 9, 8, 4, 10, 1};
//        sort(n, 0, n.length - 1);
//        System.out.print("快排结果：");
//        for (int m : n) {
//            System.out.print(m + " ");
//        }
    }

    static void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int cur = arr[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[j] > cur) j--;
            if (i < j) {
                arr[i] = arr[j];
                arr[j] = cur;
                i++;
            }
            while (i < j && arr[i] < cur) i++;
            if (i < j) {
                arr[j] = arr[i];
                arr[i] = cur;
                j--;
            }
        }
//        arr[i] = cur;
        sort(arr, l, i - 1);
        sort(arr, i + 1, r);
    }
}