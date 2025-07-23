class Solution {
    public boolean isPerfectSquare(int num) {
        
        if(num ==0 || num ==1)
        return true;

        long start = 0;
        long end = num;

        while(start<=end)
        {
            long mid = start+(end-start)/2;
            long sqr = mid*mid;
            if(sqr == num)
            {
                return true;
            }else if(sqr < num)
            {
                start = mid+1;
            }else
            {
                end = mid-1;
            }
        }
        return false;
    }
}