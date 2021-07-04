package solution.jzoffer.day3;

/**
 * JZ5  可以用replace，也可以用StringBuilder遍历
 *
 * @author Anjude
 * @date 2021/7/4 22:05
 */
public class JZ5 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}
