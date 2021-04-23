package solution.offer.zhuodong;

import java.util.Arrays;

/**
 * Created by Anjude
 * Date: 2021/4/19 20:30
 */
public class Second {
    //    有一群小学生在排队，每个人的身高和体重都知道。
//    排完队后，按照以下方式计算排队得分。
//    排第一的人不得分
//    从排第二的人开始，
//    如果这个人比前面的人的身高高的，得2分。
//    如果是体重比前面的人重的得1分。
//    如果是身高又高，体重又重的得5分。
//    输入一个二维数组，第一列是身高，第二列是体重，得知全部小学生的身高和体重，输出能够得到的最高分。
//    其中人数最多为10人。
//    Int getMostPoint(int[][] people)
//    样例：
//    输入数据
//    int[][] t = new int[][]{{120,65},{110,60},{100,50}};
//    输出 10
    public static int getMostPoint(int[][] people) {
        int len = people.length;
        int score = 0;
        for (int i = 1; i < len; i++) {
            if (people[i][0] > people[i - 1][0] && people[i][1] > people[i - 1][1]) {
                score += 5;
            } else if (people[i][0] > people[i - 1][0]) {
                score += 2;
            } else if (people[i][1] > people[i - 1][1]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        int[][] t = new int[][]{{120, 65}, {110, 60}, {100, 50}};
        System.out.println(getMostPoint(t));
    }
}
