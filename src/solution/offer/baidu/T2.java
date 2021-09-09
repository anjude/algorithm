package solution.offer.baidu;

import java.util.Scanner;

/**
 * T2  X星理工大学新学期开学典礼正在X星理工大学体育馆隆重举行，
 * 小小X作为新生代表坐上了主席台。 在无比骄傲的同时，
 * 看到下面坐着的黑压压的人群，小小X想到了这么一个问题：
 * 作为一所理工大学，女生真的很少。俗话说，红花还需绿叶衬。
 * 假设所有参加开学典礼的同学坐成一个 m 行 n 列的矩阵，
 * 其中男生用“M”表示，女生用“F”表示。
 * 如果一个女生的旁边8个方位（前、后、左、右以及左前、右前、左后、右后）坐着另外一个女生，
 * 那么她们属于“同一朵红花”。 现在给出一个用于表示男生和女生就坐情况的字符矩阵，
 * 请编写一个程序统计在该字符矩阵中一共有多少朵“红花”？
 *
 * @author Anjude
 * @date 2021/9/7 20:12
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = sc.nextLine().toCharArray();
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'F') {
                    boolean same = isSame(map, i, j, m, n);
                    if (!same) {
                        res++;
                    }
                    map[i][j] = 'c';
                }
            }
        }
        System.out.println(res);
    }

    private static boolean isSame(char[][] map, int i, int j, int m, int n) {
        if (j > 0) {
            if (map[i][j - 1] != 'M') {
                return true;
            }
            if (i > 0) {
                return map[i - 1][j] != 'M';
            }
        } else {
            if (i > 0) {
                return map[i - 1][j] != 'M';
            }
        }
        return false;
    }
}
