class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        

        int n = candies.length;
        int max =0;
       List<Boolean> result = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            max = Math.max(max, candies[i]);
        }

        for(int i=0; i<n; i++)
        {
          if(candies[i]+extraCandies >= max)
          {
            result.add(true);
          }
          else
          {
            result.add(false);
          }
        }
        return result;
    }
}