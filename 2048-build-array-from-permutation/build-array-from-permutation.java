class Solution {
    public int[] buildArray(int[] arr) {
        
         int nums[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            nums[i] = arr[arr[i]];
        }
        return nums;
    }
}