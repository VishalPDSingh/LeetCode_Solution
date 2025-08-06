class Solution {
    public int maxSubArray(int[] arr) {
        
         int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            currSum = arr[i] + currSum;
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
             if (currSum < 0) {
                currSum = 0;
             }
        }
        return maxSum;
    }
}