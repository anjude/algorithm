package solution.jzoffer.day2;

/**
 * JZ04  从右上角往左下角搜索，直到下标越界
 *
 * @author Anjude
 * @date 2021/7/4 15:12
 */
public class JZ04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length, col = matrix[0].length;
        // 开始时，右边已经是最大（col - 1），不需要再考虑右移
        int i = 0, j = col - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] > target) {
                // 当前值过大，往左移动
                j--;
            } else if (matrix[i][j] < target) {
                // 当前值过小，往下移动
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}











