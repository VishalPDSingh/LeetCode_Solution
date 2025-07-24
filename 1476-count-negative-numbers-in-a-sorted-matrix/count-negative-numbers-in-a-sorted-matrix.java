class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length-1;
        int m = grid[0].length-1;

        int count = 0;

        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                if(grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}