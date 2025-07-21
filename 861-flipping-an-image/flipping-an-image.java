class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n = image.length;// length at 0 rows


        for(int i=0; i<n; i++)
        {
            for(int j=0; j<(n+1)/2; j++)
            {
                // swap
                int temp = image[i][j]^1;
                image[i][j] = image[i][n-1-j]^1;
                image[i][n-1-j] = temp;
            }
        }
        return image;
    }
}