package solution.jzoffer;

/**
 * Created by Anjude
 * Date: 2021/4/19 21:40
 */
public class JZ1 {
//    在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
//            [
//            [1,2,8,9],
//            [2,4,9,12],
//            [4,7,10,13],
//            [6,8,11,15]
//            ]
//    给定 target = 7，返回 true。
//
//    给定 target = 3，返回 false。
//

    public boolean Find(int target, int [][] array) {
        int line = array[0].length;
        int row = array.length;
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < line; j++){
                if(target == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
