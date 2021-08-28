package solution.offer.zoom;

import solution.study.MaxProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/8/28 17:39
 */
public class T2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param nums       int整型一维数组
     * @param windowSize int整型 滑动窗口大小
     * @param step       int整型 每次移动step个数字
     * @return int整型一维数组
     */
    public int[] slideWindow(int[] nums, int windowSize, int step) {
        int left = 0, right = windowSize - 1;
        int len = nums.length;
        if (len < windowSize) {
            int lMax = nums[0];
            for (int num : nums) {
                if (lMax < num) {
                    lMax = num;
                }
            }
            return new int[]{lMax};
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len - windowSize + 1; i = i + step) {
            int max = nums[left];
            for (int j = left; j < right + 1; j++) {
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            left += step;
            right += step;
            list.add(max);
        }
        int size = list.size();
        int[] intList = new int[size];
        for (int i = 0; i < size; i++) {
            intList[i] = list.get(i);
        }
        return intList;
    }

    public static void main(String[] args) {
        int[] list = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] ints = new T2().slideWindow(list, 3, 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
