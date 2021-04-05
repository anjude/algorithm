package test;

/**
 * Created by Anjude
 * Date: 2021/4/5 13:39
 */
public class Main {
    public static void main(String[] args) {
        int a = test(5);
        System.out.println(a);
    }

    public static int test(int a) {
        if (a == 1) {
            return a;
        }
        a--;
        return test(a);
    }
}
