class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxMoney = 0;

        for(int i=0; i<accounts.length; i++)
        {
            int sum = 0; // Reset sum for each customer
            for(int j=0; j<accounts[0].length; j++)
            {
                sum = sum+accounts[i][j];
                // if(maxMoney<sum)
                // {
                //     maxMoney = sum;
                // }
            }
            maxMoney = Math.max(maxMoney, sum);
        }
        return maxMoney;
    }
}