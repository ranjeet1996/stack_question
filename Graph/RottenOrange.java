package Graph;

class Pair {
    int row;
    int col;
    int tm;

    Coordinates(int row, int col,int tm) {
      this.row=row;
      this.col=col;
      this.tm=tm;
    }
}

public class RottenOrange {

    public static void main(String[] args) {

    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();

        int vis[][] = new int[n][m];
        int freshorange = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } else {
                    vis[i][j] = 0;
                }

                if (grid[i][j] == 1)
                    freshorange++;
            }
        }

        int tm = 0;
        int drow[] = { -1, 0, +1, 0 };
        int dcol[] = { 0, 1, 0, -1 };
        int cnt = 0;

        while (!queue.isEmpty()) {
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().tm;

            tm = Math.max(tm, t);
            queue.remove();

            for (int i = 0; i < 4; i++) {

                int nextRow = r + drow[i];
                int nextColumn = c + dcol[i];

                if (nextRow >= 0 && nextRow < n && nextColumn >= 0 && nextColumn < m
                        && vis[nextRow][nextColumn] == 0 && grid[nextRow][nextColumn] == 1) {
                    queue.add(new Pair(nextRow, nextColumn, t + 1));
                    vis[nextRow][nextColumn] = 2;
                    cnt++;

                }

            }
        }

        if (cnt != freshorange)
            return -1;

        return tm;
    }
}
