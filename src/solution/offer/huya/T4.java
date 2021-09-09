package solution.offer.huya;

import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * T4  TODO
 *
 * @author Anjude
 * @date 2021/9/9 19:40
 */
public class T4 {
    public int explosion_edge_counting(int iStartX, int iStartY, int[][] pBombMatrix) {
        bloom(iStartX, iStartY, pBombMatrix);
        int res = 0;
        int xlen = pBombMatrix.length;
        int yLen = pBombMatrix[0].length;
        for (int i = 0; i < xlen; i++) {
            for (int j = 0; j < yLen; j++) {
                int count = doCount(i, j, pBombMatrix);
                res += count;
            }
        }
        return res;
    }

    private int doCount(int i, int j, int[][] map) {
        int xLen = map.length;
        int yLen = map[0].length;
        int res = 0;
        int cur = map[i][j];
        if (i - 1 < 0) {
            res++;
        } else {
            if (map[i - 1][j] != 2 && map[i - 1][j] != 3) {
                res++;
            }
        }
        if (j - 1 < 0) {
            res++;
        } else {
            if (map[i][j - 1] != 2 && map[i][j - 1] != 3) {
                res++;
            }
        }
        if (i + 1 > xLen) {
            res++;
        } else {
            if (map[i - 1][j] != 2 && map[i - 1][j] != 3) {
                res++;
            }
        }
        if (j + 1 > yLen) {
            res++;
        } else {
            if (map[i][j - 1] != 2 && map[i][j - 1] != 3) {
                res++;
            }
        }
        return res;
    }

    private void bloom(int x, int y, int[][] map) {
        if (map[x][y] == 0) {
            return;
        }
        if (map[x][y] == 1) {
            map[x][y] = 3;
        }
        int xLen = map.length;
        int yLen = map[0].length;
        if (x - 1 >= 0) {
            handleMap(x - 1, y, map);
        }
        if (x - 1 >= 0 && y - 1 >= 0) {
            handleMap(x - 1, y - 1, map);
        }
        if (y - 1 >= 0) {
            handleMap(x, y - 1, map);
        }
        if (y - 1 >= 0 && x + 1 < xLen) {
            handleMap(x + 1, y - 1, map);
        }
        if (x + 1 < xLen) {
            handleMap(x + 1, y, map);
        }
        if (x + 1 < xLen && y + 1 < yLen) {
            handleMap(x + 1, y + 1, map);
        }
        if (y + 1 < yLen) {
            handleMap(x, y + 1, map);
        }
        if (x - 1 > 0 && y + 1 < yLen) {
            handleMap(x - 1, y + 1, map);
        }
    }

    private void handleMap(int newX, int newY, int[][] map) {
        int cur = map[newX][newY];
        if (cur == 0) {
            map[newX][newY] = 2;
        }
        if (cur == 1) {
            bloom(newX, newY, map);
        }
    }

}
