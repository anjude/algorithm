package solution.leetCode.sortandother;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anjude
 * Date: 2021/4/24 1:35
 */
public class Q922 {
    public static void main(String[] args) {
        System.out.println(sortArrayByParityII(new int[]{4, 5, 2, 7}));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        if (nums == null) return new int[]{};
        int len = nums.length;
        int[] even = new int[len / 2];
        int[] odd = new int[len / 2];
        int n = 0, m = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 0) {
                even[n++] = nums[i];
            } else {
                odd[m++] = nums[i];
            }
        }
        for (int j = 0; j < len; j++) {
            if (j % 2 == 0) {
                nums[j] = even[j / 2];
            } else {
                nums[j] = odd[j / 2];
            }
        }
        return nums;
    }
}
