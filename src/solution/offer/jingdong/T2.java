package solution.offer.jingdong;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/9/11 19:57
 */
public class T2 {
    private static Set<Integer> result = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer, Set<Integer>> serverMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int count = sc.nextInt();
            for (int j = 0; j < count; j++) {
                set.add(sc.nextInt());
            }
            serverMap.put(i + 1, set);
        }
        for (int i = 0; i < q; i++) {
            int opt = sc.nextInt();
            int server = sc.nextInt();
            // 启动
            if (opt == 1) {
                Set<Integer> integers = serverMap.get(server);
                result.add(server);
                result = startSever(integers, serverMap);
            } else {
                // 关闭
                result.remove(server);
                HashSet<Integer> set = new HashSet<>();
                set.add(server);
                shutdownServer(set, serverMap);
            }
            System.out.println(result.size());
        }
    }

    private static void shutdownServer(Set<Integer> integers, Map<Integer, Set<Integer>> serverMap) {
        serverMap.forEach((k, v) -> {
            for (Integer integer : integers) {
                if (v.contains(integer)) {
                    result.remove(k);
                    HashSet<Integer> set = new HashSet<>();
                    set.add(k);
                    shutdownServer(set, serverMap);
                }
            }
        });
    }

    private static Set<Integer> startSever(Set<Integer> integers, Map<Integer, Set<Integer>> serverMap) {
        result.addAll(integers);
        integers.forEach(val -> {
            if (serverMap.get(val) != null)
                result.addAll(startSever(serverMap.get(val), serverMap));
        });
        return result;
    }

}
