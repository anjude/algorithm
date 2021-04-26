package solution.leetCode.sortandother;


import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/23 17:55
 */
public class Q349 {
    public static void main(String[] args) {
        intersection(new int[]{1, 23, 3}, new int[]{2, 3, 4});
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums2.length == 0 || nums1.length == 0) return new int[]{};
        Map<Integer, Integer> m = new HashMap<>();
        Set<Integer> res = new HashSet<>();
        int len = nums1.length;
        for (int i = 0; i < len; i++) {
            m.put(nums1[i], m.getOrDefault(nums1[i], 0) + 1);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (m.get(nums2[j]) != null) {
                res.add(nums2[j]);
            }
        }
        if (res.size() == 0) {
            return new int[]{};
        }
        int[] ret = new int[res.size()];
        int k = 0;
        for (int n : res) {
            ret[k++] = n;
        }
        return ret;
    }
}
