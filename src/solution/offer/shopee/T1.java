package solution.offer.shopee;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/8/2 19:19
 */
public class T1 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     * @param n int整型 整数n
     * @param k int整型 分为k份
     * @return int整型
     */
    public int divide(int n, int k) {
        int res = 0;
        int curN = 0;
        int curK = 0;

        search(n, k , curN,curK);
        return res;
    }

    private int search(int n, int k, int curN, int curK) {
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new T1().divide(7, 3));
    }
}
