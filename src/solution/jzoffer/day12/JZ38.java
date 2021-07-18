package solution.jzoffer.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JZ38  TODO
 *
 * @author Anjude
 * @date 2021/7/18 21:12
 */
public class JZ38 {

    List<String> rec;
    boolean[] vis;

    public String[] permutation(String s) {
        int n = s.length();
        rec = new ArrayList<String>();
        vis = new boolean[n];
        char[] arr = s.toCharArray();
        // 排序，便于检测重复元素
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        backtrack(arr, 0, n, sb);
        return rec.toArray(new String[0]);
    }

    private void backtrack(char[] arr, int i, int n, StringBuilder sb) {
        if (i == n) {
            rec.add(sb.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            // 已被访问 || 重复元素
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            vis[j] = true;
            sb.append(arr[j]);
            backtrack(arr, i + 1, n, sb);
            // 清空状态
            sb.deleteCharAt(sb.length() - 1);
            vis[j] = false;
        }
    }
}














