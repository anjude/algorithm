package solution.offer.huya;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * T1  TODO
 *
 * @author Anjude
 * @date 2021/9/9 19:01
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        int length = s1.length();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();
        Map<Character, Integer> s3Map = new HashMap<>();
        Map<Character, Integer> s4Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            int times = s1Map.getOrDefault(c, 0);
            if (times >= c1) {
                c1 = times + 1;
            }
            s1Map.put(c, times + 1);
        }
        for (char c : s2.toCharArray()) {
            int times = s2Map.getOrDefault(c, 0);
            if (times >= c2) {
                c2 = times + 1;
            }
            s2Map.put(c, times + 1);
        }
        for (char c : s3.toCharArray()) {
            int times = s3Map.getOrDefault(c, 0);
            if (times >= c3) {
                c3 = times + 1;
            }
            s3Map.put(c, times + 1);
        }
        for (char c : s4.toCharArray()) {
            int times = s4Map.getOrDefault(c, 0);
            if (times >= c4) {
                c4 = times + 1;
            }
            s4Map.put(c, times + 1);
        }
        int maxCount = 0;
        if (c1 + m > length) {
            c1 = length;
            maxCount++;
        } else {
            c1 += m;
        }
        if (c2 + m > length) {
            c2 = length;
            maxCount++;
        } else {
            c2 += m;
        }
        if (c3 + m > length) {
            c3 = length;
            maxCount++;
        } else {
            c3 += m;
        }
        if (c4 + m > length) {
            c4 = length;
            maxCount++;
        } else {
            c4 += m;
        }
        if (maxCount > 1) {
            System.out.println("tie");
            return;
        }
        if (c1 > c2 && c1 > c3 && c1 > c4) {
            System.out.println("xiaohu");
        } else if (c2 > c1 && c2 > c3 && c2 > c4) {
            System.out.println("xiaoyu");
        } else if (c3 > c1 && c3 > c2 && c3 > c4) {
            System.out.println("xiaoyu");
        } else if (c4 > c1 && c4 > c3 && c4 > c2) {
            System.out.println("xiaoyu");
        } else {
            System.out.println("tie");
        }

    }
}
