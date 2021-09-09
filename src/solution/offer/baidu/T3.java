package solution.offer.baidu;

import java.util.Scanner;

/**
 * T3  小明的店里准备了一些礼物，分为a，b两个品种。
 * 为了促销，小明希望把礼物进行组合后打包售卖。
 * 组合的方式包括两种，一种是组合里有x件a类礼物加y件b类礼物，一种是组合里有x件b类礼物加y件a类礼物。
 * 小明希望自己的组合数越多越好，你能告诉他他最多可以组多少个组合么？
 *
 * @author Anjude
 * @date 2021/9/7 19:48
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = 0;
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
        }

        while (a > x && b > y) {
            a -= x;
            b -= y;
            res++;
        }
        while (b >= x && a >= y) {
            a -= y;
            b -= x;
            res++;
        }
        System.out.println(res);
    }
}
