class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k%nums.length;
        if(k<0)
        {
            k+=nums.length;
        }
         
        int n = nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
     public static void reverse(int arr[],int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}