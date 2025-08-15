class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
         for(int i=0; i<n; i++)
        {
            nums1[m+i] = nums2[i];
        }

         // Step 2: Sort the whole nums1
         Arrays.sort(nums1);

         for(int arr:nums1)
         {
            System.out.println(arr);
         } 
    }
}