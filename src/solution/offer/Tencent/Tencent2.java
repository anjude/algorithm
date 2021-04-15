package solution.offer.Tencent;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/4 20:16
 */
public class Tencent2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Integer> nums = new ArrayList<>(n);
        String[] num = new String[n];
        num = in.nextLine().split("");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(num[i]);
            nums.add(a);
        }
        for (int i = 0; i < n - 1; i++) {
            for (; i < n - 1; i++) {
                if (nums.get(i) + nums.get(i + 1) == 10) {
                    nums.remove(i);
                    nums.remove(i);
                    if (nums.get(i - 1) == nums.get(i)) {
                        nums.remove(i - 1);
                        nums.remove(i - 1);
                        n -= 2;
                    }
                    n -= 2;
                }
            }
            i = 0;
        }
        Collections.sort(nums);;
        System.out.println(n);
    }

    public static ArrayList<Integer> dealList(int index) {
        return null;
    }
}
