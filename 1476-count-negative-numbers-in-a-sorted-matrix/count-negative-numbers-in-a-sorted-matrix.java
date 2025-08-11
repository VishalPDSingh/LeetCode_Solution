class Solution {
    public int countNegatives(int[][] arr) {
        
          int i = 0; 
        int j = arr[0].length - 1;
        int count = 0;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] < 0) {
                // all elements below this are also negative
                count += arr.length - i;
                j--; // move left
            } else {
                i++; // move down
            }
        }
        return count;
    }
}