class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {

      int ans[] = new int[2];
       int sumA = 0;
       int sumB = 0;
       for(int i=0; i<a.length; i++)
       {
        sumA+=a[i];
       }
       for(int j=0; j<b.length; j++)
       {
        sumB+=b[j];
       }

       for(int i=0; i<a.length; i++)
       {
        for(int j=0; j<b.length; j++)
        {
            if(sumA-a[i]+b[j] == sumB-b[j]+a[i])
            {
                ans[0] = a[i];
                ans[1] = b[j];
                return ans;
            }
        }
       }
       return ans;
        
    }
}