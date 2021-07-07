package solution.jzoffer.day4;

/**
 * JZ14  平均分段乘积最大，拆成3的乘积最大
 *
 * @author Anjude
 * @date 2021/7/7 23:46
 */
public class JZ14 {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int remain = n % 3;
        int s = n / 3;
        if (remain == 0) return (int) Math.pow(3, s);
        if (remain == 1) return (int) Math.pow(3, s - 1) * 4;
        return (int) Math.pow(3, s) * 2;
    }

    public static void main(String[] args) {
        JZ14 jz14 = new JZ14();
        System.out.println(jz14.cuttingRope(10));
    }
}




















