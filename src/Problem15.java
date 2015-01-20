/**
 * Created by Chris on 1/18/2015.
 * According to http://mathworld.wolfram.com/LatticePath.html
 * "The number of paths from origin to (a, b), restricted to
 * east and north steps is (a + b) choose a.
 */
public class Problem15 {
    long[][] grid = new long[21][21];

    public static void main(String[] args) {
        Problem15 problem = new Problem15();
    }

    public Problem15() {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                grid[i][j] = 0;
            }
        }

        System.out.print(path(0, 0));
    }

    public long path(int x, int y) {
        // if out of bounds
        if (x > 20 || y > 20) {
            return 0;
        }

        // found the end
        if (x == 20 && y == 20) {
            return 1;
        }

        // unexplored
        if (grid[x][y] == 0) {
            grid[x][y] = path(x + 1, y) + path(x, y + 1);
        }


        return grid[x][y];
    }
}
