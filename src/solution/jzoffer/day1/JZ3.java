package solution.jzoffer.day1;

/**
 * JZ3  使用一个bit数组判断是否重复
 *
 * @author Anjude
 * @date 2021/7/4 14:54
 */
public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        for (int a : nums) {
            if (arr[a] == 1) return a;
            arr[a] = 1;
        }
        return -1;
    }
}
