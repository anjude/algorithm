package solution.offer.meituan2;

import java.util.Scanner;

/**
 * T3  TODO
 *
 * @author Anjude
 * @date 2021/9/4 16:08
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        if (n <= 2) {
            System.out.println("ac".equals(s) ? 1 : 0);
        }
        int cIndex = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if (cur == 'c') {
                res += i - cIndex;
                cIndex++;
            }
        }
        System.out.println(res);
    }
}
