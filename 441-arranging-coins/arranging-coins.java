class Solution {
    public int arrangeCoins(int n) {
        
        // Binary Search 

        long start = 0;
        long end = n;

        while(start<=end)
        {
            long mid = start+(end-start)/2;
            //Calculate the total coins required for mid rows:
            long coins_needed = (mid*(mid+1))/2;

            if(coins_needed == n)
            {
                return (int)mid; // pefect staircase 
            }else if(coins_needed < n)
            {
                start = mid+1; // make more row
            }else
            {
                end = mid-1; // to many coins, reduce row
            }
        }
        return (int) end;
    }
}