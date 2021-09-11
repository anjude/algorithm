package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Greedy  贪心算法
 *
 * @author Anjude
 * @date 2021/9/9 22:40
 */
public class Greedy {
    public static void main(String[] args) {
        int n = 0, avg = 0, s = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Please input the number of heaps:");
        n = scanner.nextInt();
        System.out.println("Please input heap number:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        for (Integer integer : array) {
            avg += integer;
        }
        avg = avg / array.size();
        System.out.println(array.size());
        System.out.println(avg);
        for (int i = 0; i < array.size() - 1; i++) {
            s++;
            array.set(i + 1, array.get(i + 1) + array.get(i) - avg);
        }
        System.out.println("s:" + s);
    }
}
