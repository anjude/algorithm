package solution.offer.shopee;

import sun.misc.Regexp;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * T3  TODO
 *
 * @author Anjude
 * @date 2021/8/2 19:22
 */
public class T3 {
    /**
     * Note: 类名、方法名、参数名已经指定，请勿修改
     *
     * @param inxml string字符串 xml字符串
     * @param path  string字符串 取值路径
     * @return string字符串
     */
    public String GetXMLValue(String inxml, String path) {
        String[] tags = path.split("\\.");
        StringBuilder xml = new StringBuilder();
        for (String tag : tags) {
            xml.append("<").append(tag).append(">");
        }
        String regx = xml.toString();
        int size = regx.length();
        int i = 0;
        for (; i < size; i++) {
            if (inxml.charAt(i) != regx.charAt(i)) {
                return "";
            }
        }
        String res = "";
        while (inxml.charAt(i) != '<') {
            res += inxml.charAt(i++);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new T3().GetXMLValue("<people><name>shopee</name></people>", "people.name"));
    }
}
