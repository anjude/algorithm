package solution.offer.p360;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/17 15:44
 */
public class First {
    public static int min(String s) {
        if (s == null || s.length() < 2) return 0;
        char[] str = s.toCharArray();
        int l = 0;
        int r = str.length - 1;
        return process(str, l, r);
    }

    static int[] add = {0, 100, 200, 360, 220};
    static int[] delete = {0, 120, 350, 200, 320};

    private static int process(char[] str, int l, int r) {
        if (l > r) return 0;
        if (str[l] == str[r]) return process(str, l + 1, r - 1);
        int ladd = process(str, l, r - 1) + add[str[r] - '0'];
        int ldel = process(str, l + 1, r) + delete[str[r] - '0'];
        int radd = process(str, l + 1, r) + add[str[r] - '0'];
        int rdel = process(str, l, r - 1) + delete[str[r] - '0'];
        return Math.min(ladd, Math.min(ladd, Math.min(ldel, Math.min(radd, rdel))));
    }
}
