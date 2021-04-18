package solution.offer.p360;

import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/17 15:49
 */
public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int times = 0;
        while (sb.toString().matches(".*a.*b.*")) {
            for (int i = 0; i < sb.toString().length() - 1; i++) {
                if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                    times++;
                    sb.replace(i, i + 2, "bba");
                }
            }
//            s = s.replace("ab", "bba");
        }
        System.out.println(times);
    }
}
