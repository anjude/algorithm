package solution.offer.yuewen;

/**
 * Created by Anjude
 * Date: 2021/4/11 16:33
 */
public class First {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @param k   int整型
     * @return int整型
     */
    public int characterReplacement(String str, int k) {
        if (str == null) {
            return 0;
        }
        int len = str.length();
        int max = 0;
        int[] list = new int[128];
        for (int i = 0; i < len; i++) {
            char cur = str.charAt(i);
            list[cur]++;
            int curNum = list[cur];
            if (curNum > max) {
                max = curNum;
            }
        }
        max = max + k <= len ? max + k : len;
        return max;
    }
    public static void main(String[] args) {
        First a = new First();
        System.out.println(a.characterReplacement("ABAB", 2));
    }
}
