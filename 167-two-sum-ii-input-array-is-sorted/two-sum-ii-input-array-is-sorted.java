class Solution {
    public int[] twoSum(int[] num, int target) {
        
        int left = 0;
        int right = num.length-1;

        while(num[left]+num[right] != target)
        {
            if(num[left]+num[right] < target)
            left++;
            else
            right--;
        }
        return new int[]{left+1 , right+1};
    }
}