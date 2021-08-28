package solution.offer.keda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/7/31 19:59
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int size = list.size();
        if (size < 2) {
            System.out.println(1);
        }
        int curMax = list.get(1) - list.get(0);
        for (int i = 2; i < size - 1; i++) {
            int curDistance = list.get(i + 1) - list.get(i);
            if (curDistance > curMax) {
                curMax = curDistance;
            }
        }
        int res = curMax % 2 == 0 ? curMax / 2 : curMax / 2 + 1;
        System.out.println(res);
    }
}
