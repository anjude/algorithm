package solution.jzoffer.day3;

import solution.jzoffer.JZ2;

/**
 * JZ12  回溯
 *
 * @author Anjude
 * @date 2021/7/4 17:34
 */
public class JZ12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        // 越界或者字符不匹配 -- 此路不通
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        // 最后一个字符匹配，返回true
        if (k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        JZ12 jz12 = new JZ12();
        jz12.exist(new char[][]{{'a','b'},{'a','b'}}, "abb");
    }
}






















