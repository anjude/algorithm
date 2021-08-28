package solution.offer.keda;

import java.util.Scanner;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/7/31 19:59
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int curIndex = K;
        for (int i = 0; i < X; i++) {
            int form = sc.nextInt();
            int to = sc.nextInt();
            if (to == curIndex) {
                curIndex = form;
            } else if (form == curIndex) {
                curIndex = to;
            }
        }
        System.out.println(curIndex);
    }
}
