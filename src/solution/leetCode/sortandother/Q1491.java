package solution.leetCode.sortandother;

/**
 * Created by Anjude
 * Date: 2021/4/26 1:23
 */
public class Q1491 {
    public double average(int[] salary) {
        double min = Math.min(salary[0], salary[1]);
        double max = Math.max(salary[0], salary[1]);
        double sum = max + min;
        int len = salary.length;
        for (int i = 2; i < len; i++) {
            int cur = salary[i];
            sum += cur;
            min = Math.min(cur, min);
            max = Math.max(cur, max);
        }
        return (sum - min - max) / (len - 2);
    }
}
