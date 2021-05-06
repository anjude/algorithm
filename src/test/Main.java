package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Anjude
 * Date: 2021/4/19 22:18
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
        String s = "aabbd";
        int len = s.length();
        int[] list = new int[26];
        for (int i = 0; i < len; i++) {
            char letter = s.charAt(i);
            list[letter - 'a']++;
        }
        System.out.println(Arrays.toString(list));
    }
}
