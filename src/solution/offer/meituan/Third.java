package solution.offer.meituan;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/18 10:49
 */
public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> sortList = new ArrayList<>();
        Map<String, List<String>> train = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] s = in.nextLine().split(" ");
            if (s[0] == "1") {
                if (!sortList.contains(s[2])) {
                    sortList.add(s[2]);
                }
                train.get(s[2]).add(s[1]);
            } else if (s[0] == "2") {
                int[] swap = new int[2];
                int flag = 0;
                for (int j = 0; j < sortList.size(); j++) {
                    if (sortList.get(j) == s[1] || sortList.get(j) == s[2]) {
                        swap[flag] = j;
                        flag++;
                    }
                }
                String temp = sortList.get(swap[0]);
                sortList.set(swap[0], sortList.get(swap[1]));
                sortList.set(swap[1], temp);
            }
        }
        for (int z = 0; z < sortList.size(); z++) {
            List<String> list = train.get(sortList.get(z));
            for (int n = 0; n < list.size(); n++){
                System.out.print(list.get(n) + " ");
            }
        }
    }
}
