class Solution {
    public int diagonalSum(int[][] arr) {
        
         int n = arr.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];                 // primary diagonal
            sum += arr[i][n - 1 - i];         // secondary diagonal
        }
        
        // Subtract center element if matrix size is odd (it was added twice)
        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }

        return sum;
    }
}