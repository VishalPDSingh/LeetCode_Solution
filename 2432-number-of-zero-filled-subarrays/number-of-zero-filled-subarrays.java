class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long length = 0;

        for (int num : nums) {
            if (num == 0) {
                length++;          // extend the zero block
                count += length;   // add subarrays ending at this position
            } else {
                length = 0;        // reset if non-zero
            }
        }
        return count;
    }
}
