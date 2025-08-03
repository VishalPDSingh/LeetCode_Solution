class Solution {
    public int diagonalSum(int[][] arr) {
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || i+j == arr[0].length-1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}