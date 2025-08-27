class Solution {
    private static final int[][] DIRECTIONS = {
        {1, 1},   // ↘
        {1, -1},  // ↙
        {-1, -1}, // ↖
        {-1, 1}   // ↗
    };

    // Clockwise transitions (↘→↙→↖→↗→↘)
    private static final int[] CLOCKWISE = {1, 2, 3, 0};

    public int lenOfVDiagonal(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int n = grid.length, m = grid[0].length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        maxLength = Math.max(maxLength, dfs(grid, i, j, d, false, 0));
                    }
                }
            }
        }
        return maxLength;
    }

    private int dfs(int[][] grid, int x, int y, int dir, boolean turned, int idx) {
        int best = idx + 1; // include current cell

        // Continue in same direction
        int nx = x + DIRECTIONS[dir][0];
        int ny = y + DIRECTIONS[dir][1];
        if (isInside(grid, nx, ny) && matchesSequence(grid[nx][ny], idx + 1)) {
            best = Math.max(best, dfs(grid, nx, ny, dir, turned, idx + 1));
        }

        // Try clockwise turn if not used
        if (!turned) {
            int ndir = CLOCKWISE[dir];
            int tx = x + DIRECTIONS[ndir][0];
            int ty = y + DIRECTIONS[ndir][1];
            if (isInside(grid, tx, ty) && matchesSequence(grid[tx][ty], idx + 1)) {
                best = Math.max(best, dfs(grid, tx, ty, ndir, true, idx + 1));
            }
        }

        return best;
    }

    private boolean matchesSequence(int value, int idx) {
        if (idx == 0) return value == 1;
        if (idx % 2 == 1) return value == 2;
        return value == 0;
    }

    private boolean isInside(int[][] grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
    }
}
