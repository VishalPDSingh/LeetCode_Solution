class Solution {
    public int[] buildArray(int[] nums) {
        
        // Create an array
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}