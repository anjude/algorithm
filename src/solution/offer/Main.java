package solution.offer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Anjude
 */
public class Main {
    static int[] list = new int[]{1000, 100, 200};
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(list[0], 100);
        map.put(list[1], 100);
        map.put(list[2], 700);
        Arrays.sort(list);
        int initAttack = list[0];
        int curAttack = list[0];
        for (int boss : list) {
            if (curAttack < boss) {
                int gap = boss - curAttack;
                curAttack += gap;
                initAttack += gap;
            }
            curAttack += map.get(boss);
        }
        System.out.println(initAttack);
    }
}
