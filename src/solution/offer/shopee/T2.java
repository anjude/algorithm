package solution.offer.shopee;

/**
 * T2  TODO
 *
 * @author Anjude
 * @date 2021/8/2 19:22
 */
public class T2 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     * <p>
     * <p>
     * find balanced index for an input array
     *
     * @param inputArray int整型一维数组 the input array
     * @return int整型
     */
    public int findBalancedIndex(int[] inputArray) {
        int index = 0;
        int sum = 0;
        for (int n : inputArray) {
            sum += n;
        }
        int cur = 0;
        for (int m : inputArray) {
            cur += m;
            if (cur - m == (sum - m) / 2) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new T2().findBalancedIndex(new int[]{1, 2, 3, 4, 6}));
    }
}
