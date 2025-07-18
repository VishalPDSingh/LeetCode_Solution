class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        //Create an array
        int arr[] = new int[2*n];

        for(int i=0; i<n; i++)
        {
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
}