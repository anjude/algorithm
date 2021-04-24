package solution.leetCode;

import java.util.*;

/**
 * Created by Anjude
 * Date: 2021/4/24 1:07
 */
public class Q350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return new int[]{};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> li = new ArrayList<>();
        int len = nums1.length;
        int i = 0, j = 0;
        while (i < len && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                li.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = li.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
