class Solution {
    public int majorityElement(int[] nums) {
     
       Arrays.sort(nums);  // sort array first
        int majorityCount = nums.length / 2;

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // reset count for new number
            }

            if (count > majorityCount) {
                return nums[i]; // found majority element
            }
        }

        return nums[0]; // fallback (majority always exists)
        
    }
}