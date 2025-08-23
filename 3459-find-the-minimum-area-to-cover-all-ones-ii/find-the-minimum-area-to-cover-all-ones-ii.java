//import java.util.*;

class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        List<int[]> ones = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) ones.add(new int[]{i, j});
            }
        }
        if (ones.isEmpty()) return 0;

        int ans = Integer.MAX_VALUE;

        // Vertical partitions
        for (int c1 = 0; c1 < n; c1++) {
            for (int c2 = c1; c2 < n; c2++) {
                List<int[]> left = new ArrayList<>();
                List<int[]> mid = new ArrayList<>();
                List<int[]> right = new ArrayList<>();
                for (int[] p : ones) {
                    if (p[1] <= c1) left.add(p);
                    else if (p[1] <= c2) mid.add(p);
                    else right.add(p);
                }
                if (!left.isEmpty() && !mid.isEmpty() && !right.isEmpty()) {
                    int sum = area(left, m, n) + area(mid, m, n) + area(right, m, n);
                    ans = Math.min(ans, sum);
                }
            }
        }

        // Horizontal partitions
        for (int r1 = 0; r1 < m; r1++) {
            for (int r2 = r1; r2 < m; r2++) {
                List<int[]> top = new ArrayList<>();
                List<int[]> mid = new ArrayList<>();
                List<int[]> bottom = new ArrayList<>();
                for (int[] p : ones) {
                    if (p[0] <= r1) top.add(p);
                    else if (p[0] <= r2) mid.add(p);
                    else bottom.add(p);
                }
                if (!top.isEmpty() && !mid.isEmpty() && !bottom.isEmpty()) {
                    int sum = area(top, m, n) + area(mid, m, n) + area(bottom, m, n);
                    ans = Math.min(ans, sum);
                }
            }
        }

        // Mixed partitions: vertical then horizontal
        for (int c = 0; c < n - 1; c++) {
            List<int[]> left = new ArrayList<>(), right = new ArrayList<>();
            for (int[] p : ones) {
                if (p[1] <= c) left.add(p); else right.add(p);
            }
            if (left.isEmpty() || right.isEmpty()) continue;

            // Split right horizontally
            for (int r = 0; r < m - 1; r++) {
                List<int[]> rtop = new ArrayList<>(), rbot = new ArrayList<>();
                for (int[] p : right) {
                    if (p[0] <= r) rtop.add(p); else rbot.add(p);
                }
                if (!rtop.isEmpty() && !rbot.isEmpty()) {
                    int sum = area(left, m, n) + area(rtop, m, n) + area(rbot, m, n);
                    ans = Math.min(ans, sum);
                }
            }

            // Split left horizontally
            for (int r = 0; r < m - 1; r++) {
                List<int[]> ltop = new ArrayList<>(), lbot = new ArrayList<>();
                for (int[] p : left) {
                    if (p[0] <= r) ltop.add(p); else lbot.add(p);
                }
                if (!ltop.isEmpty() && !lbot.isEmpty()) {
                    int sum = area(right, m, n) + area(ltop, m, n) + area(lbot, m, n);
                    ans = Math.min(ans, sum);
                }
            }
        }

        // Horizontal then vertical
        for (int r = 0; r < m - 1; r++) {
            List<int[]> top = new ArrayList<>(), bottom = new ArrayList<>();
            for (int[] p : ones) {
                if (p[0] <= r) top.add(p); else bottom.add(p);
            }
            if (top.isEmpty() || bottom.isEmpty()) continue;

            for (int c = 0; c < n - 1; c++) {
                List<int[]> cleft = new ArrayList<>(), cright = new ArrayList<>();
                for (int[] p : bottom) {
                    if (p[1] <= c) cleft.add(p); else cright.add(p);
                }
                if (!cleft.isEmpty() && !cright.isEmpty()) {
                    int sum = area(top, m, n) + area(cleft, m, n) + area(cright, m, n);
                    ans = Math.min(ans, sum);
                }

                cleft.clear(); cright.clear();
                for (int[] p : top) {
                    if (p[1] <= c) cleft.add(p); else cright.add(p);
                }
                if (!cleft.isEmpty() && !cright.isEmpty()) {
                    int sum = area(bottom, m, n) + area(cleft, m, n) + area(cright, m, n);
                    ans = Math.min(ans, sum);
                }
            }
        }

        return ans;
    }

    // ✅ Missing helper function
    private int area(List<int[]> list, int m, int n) {
        if (list.isEmpty()) return 0;
        int minR = m, maxR = -1, minC = n, maxC = -1;
        for (int[] p : list) {
            minR = Math.min(minR, p[0]);
            maxR = Math.max(maxR, p[0]);
            minC = Math.min(minC, p[1]);
            maxC = Math.max(maxC, p[1]);
        }
        return (maxR - minR + 1) * (maxC - minC + 1);
    }
}
