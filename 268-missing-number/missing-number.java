class Solution {
    public int missingNumber(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            return -1; // no valid input
        }

        // Create count array of length n+1 (since numbers are from 0..n)
        int count[] = new int[nums.length + 1];

        // Mark presence of each number
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Check which index is missing
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                return i; // missing number found
            }
        }

        return -1; // fallback (should never reach here because one number is guaranteed missing)
    }
}
