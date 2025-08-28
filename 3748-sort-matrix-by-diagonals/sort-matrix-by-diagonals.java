//import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Bottom-left diagonals (non-increasing order)
        for (int row = 0; row < n; row++) {
            sortDiagonal(grid, row, 0, false);
        }
        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, n - 1, col, false);
        }

        // Top-right diagonals (non-decreasing order)
        for (int col = 1; col < n; col++) {
            sortDiagonal(grid, 0, col, true);
        }
        for (int row = 1; row < n; row++) {
            sortDiagonal(grid, row, n - 1, true);
        }

        return grid;
    }

    // Helper method to extract, sort, and rewrite a diagonal
    private void sortDiagonal(int[][] grid, int row, int col, boolean ascending) {
        int n = grid.length;
        List<Integer> diagonal = new ArrayList<>();

        int r = row, c = col;
        while (r < n && c < n) {
            diagonal.add(grid[r][c]);
            r++;
            c++;
        }

        if (ascending) {
            Collections.sort(diagonal); // non-decreasing
        } else {
            diagonal.sort(Collections.reverseOrder()); // non-increasing
        }

        r = row;
        c = col;
        int idx = 0;
        while (r < n && c < n) {
            grid[r][c] = diagonal.get(idx++);
            r++;
            c++;
        }
    }
}

