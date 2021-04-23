package solution.offer.zhuodong;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anjude
 * Date: 2021/4/19 20:12
 */
//输入数据
//    select c,count(a),sum(b) from t group by c;
//        int[][] t = new int[][]{
//        {1,2,3},
//        {4,5,6},
//        {7,8,3}
//        };
//        a = 1
//        b = 2
//        c = 3
//        输出
//        new int[][]{{3,2,10},{6,1,5}}
public class First {
    static int[][] calSql(int[][] t, int a, int b, int c) {

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < t.length; i++) {
            // 按c group
            int key = t[i][c - 1];
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
            sumMap.put(key, sumMap.getOrDefault(key, 0) + t[i][b - 1]);
        }
        int len = countMap.size(), group = 0;
        int[][] ret = new int[len][3];

        for (int key : countMap.keySet()) {
            ret[group][0] = key;
            ret[group][1] = countMap.get(key);
            ret[group][2] = sumMap.get(key);
            group++;
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(calSql(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 3}}, 1, 2, 3).toString());
    }
}
