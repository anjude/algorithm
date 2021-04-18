package solution.study;

/**
 * Created by Anjude
 * Date: 2021/4/18 11:55
 * 查找x的平方根整数部分
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(24));
        System.out.println(newton(24));
    }

    public static int binarySearch(int x) {
        int index = -1, l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // 如果当前mid平方小于x，记录当前mid，继续查找下一位
            // 否则，右指针缩小范围
            if (mid * mid <= x) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }

    // 牛顿迭代
    public static int newton(int x) {
        if (x == 0) return 0;
        return (int) sqrt(x, x);
    }

    // 找均值
    public static double sqrt(double i, int x) {
        double res = (i + x / i) / 2;
        if (res == i) {
            return i;
        } else {
            return sqrt(res, x);
        }
    }

}
