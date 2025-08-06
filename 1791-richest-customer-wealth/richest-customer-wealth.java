class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxMoney = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++)
        {
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++)
            {
                sum = accounts[i][j] + sum;
                if(maxMoney < sum)
                {
                    maxMoney = sum;
                }
            }
        }
        return maxMoney;
    }
}