package solution.offer.baidu;

import java.util.Scanner;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/9/7 19:36
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        char[] easy = new char[]{'e', 'a', 's', 'y'};
        int index = 0;
        int res = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == easy[index] || (c + ('a' - 'A')) == easy[index]) {
                index++;
            }
            if (index == 4) {
                res++;
                index = 0;
            }
        }
        System.out.println(res);
    }
}
