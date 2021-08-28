package solution.offer.Tencent;

import java.lang.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo  TODO
 *
 * @author Anjude
 * @date 2021/8/16 20:36
 */
class Main {
    public static void main(String[] args) {
        String in = "this sky  is blue";
        int len = in.length();
        List<String> b = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        int flag = 0;
        int wordNum = 0;
        for (int i = 0; i < len; i++) {
            char cur = in.charAt(i);
            if (cur == ' ') {
                if (flag == 0) {
                    b.add(s.toString());
                    s = new StringBuilder();
                    wordNum++;
                    flag = 1;
                }
            } else {
                s.append(cur);
                flag = 0;
            }
        }
        b.add(s.toString());
        b.forEach(val -> {
            System.out.print(val + " ");
        });
    }
}