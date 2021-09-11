package solution.offer.jingdong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/9/11 19:37
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map[i] = s.toCharArray();
        }
        Map<Character, int[]> mapIndex = new HashMap<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int[] index = new int[2];
                index[0] = i;
                index[1] = j;
                mapIndex.put(map[i][j], index);
            }
        }
        char[] type = sc.nextLine().toCharArray();
        int typeLen = type.length;
        int curI = 0;
        int curJ = 0;
        int res = 0;
        for (int i = 0; i < typeLen; i++) {
            char cur = type[i];
            int[] toIndex = mapIndex.get(cur);
            int toI = toIndex[0];
            int toJ = toIndex[1];
            if (toI != curI && toJ != curJ) {
                res += y;
            }
            res = res + Math.abs(toI - curI) * x;
            res = res + Math.abs(toJ - curJ) * x;
            res += z;
            curI = toI;
            curJ = toJ;
        }
        System.out.println(res);
    }
}
