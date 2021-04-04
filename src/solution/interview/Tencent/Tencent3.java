package solution.interview.Tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Anjude
 * Date: 2021/4/4 21:06
 */
public class Tencent3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int groupNum = Integer.parseInt(in.nextLine());
        for (int j = 0; j < groupNum; j++) {
            int nums = Integer.parseInt(in.nextLine());
            int timeSum = 0;
            List<Integer> time = new ArrayList<>(nums);
            for (int i = 0; i < nums; i++) {
                time.add(in.nextInt());
            }
            for (int i = 0; i < nums; i = i + 2) {
                timeSum += time.get(i);
            }
            System.out.println(timeSum);
        }
    }
}
