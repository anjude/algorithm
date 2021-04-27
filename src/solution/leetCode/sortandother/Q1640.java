package solution.leetCode.sortandother;

/**
 * Created by Anjude
 * Date: 2021/4/26 17:09
 */
public class Q1640 {
    public static void main(String[] args) {
        int[] a = new int[]{91, 4, 64, 78};
        int[][] b = new int[][]{{78}, {4, 64}, {91}};
        System.out.println(canFormArray(a, b));
    }

    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int len = arr.length;
        int pLen = pieces.length;
        for (int i = 0; i < len;) {
            int flag = 0;
            for (int j = 0; j < pLen; j++) {
                if (pieces[j][0] == arr[i]) {
                    flag = 1;
                    int index = 0;
                    while (index < pieces[j].length) {
                        if (pieces[j][index++] == arr[i])
                            i++;
                        else
                            return false;
                    }
                    break;
                }
            }
            if (flag == 0) return false;
        }
        return true;
    }

    public boolean canFormArray1(int[] arr, int[][] pieces) {
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < pieces[k].length; j++) {
                if (arr[i] != pieces[k][j]) {
                    k++;
                    if (k >= pieces.length) return false;
                    j = -1;
                } else {
                    i = j + 1 < pieces[k].length ? i + 1 : i;
                }
            }
        }
        return true;
    }
}
