package solution.offer.yuewen;

/**
 * Created by Anjude
 * Date: 2021/4/11 16:36
 */
public class Second {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param number long长整型
     * @return long长整型
     */
    public long sumDigits(long number) {
        // write code here
        String a = String.valueOf(number);
        int len = a.length();
        long sum = 0;
        for (int i = 0; i < len; i++) {
            sum += Integer.valueOf(a.charAt(i) - 48);
        }
        return sum;
    }

    public static void main(String[] args) {
        Second a = new Second();
        System.out.println(a.sumDigits(123));
    }
}
