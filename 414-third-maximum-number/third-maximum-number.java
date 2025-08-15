class Solution {
    public int thirdMax(int[] nums) {
        
        // Sort the array in descending order
        Arrays.sort(nums);
        
        // Reverse the sorted array for easy max access
        int[] desc = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            desc[i] = nums[nums.length - 1 - i];
        }

        // Count distinct numbers while iterating
        int distinctCount = 1;  // first number is always distinct
        int prev = desc[0];

        for (int i = 1; i < desc.length; i++) {
            if (desc[i] != prev) {
                distinctCount++;
                prev = desc[i];
            }
            if (distinctCount == 3) {
                return desc[i]; // third distinct found
            }
        }

        // If less than 3 distinct numbers, return the maximum
        return desc[0];
    }
}