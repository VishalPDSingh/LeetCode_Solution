class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0, idx = 0;
        
        boolean up = true; // start going upward
        
        while (idx < m * n) {
            result[idx++] = mat[r][c];

            if (up) { // moving up
                if (c == n - 1) { // hit right border
                    r++;
                    up = false;
                } else if (r == 0) { // hit top border
                    c++;
                    up = false;
                } else {
                    r--;
                    c++;
                }
            } else { // moving down
                if (r == m - 1) { // hit bottom border
                    c++;
                    up = true;
                } else if (c == 0) { // hit left border
                    r++;
                    up = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        
        return result;
    }
}
