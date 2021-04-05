package solution.leetCode;

/**
 * Created by Anjude
 * Date: 2021/4/5 0:30
 */
public class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int i = 0, j = 0;
        int[] res = {0, 0};
        for (; i < len - 1; i++) {
            for (j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
