class Solution {
    public int maxSubArray(int[] nums) {
        
       int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Check if all numbers are negative
        boolean allNegative = true;
        int maxElement = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                allNegative = false;
            }
            maxElement = Math.max(maxElement, nums[i]);
        }

        // If all elements are negative, return the maximum element
        if (allNegative) {
            return maxElement;
        }

        // Apply Kadane's Algorithm
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}