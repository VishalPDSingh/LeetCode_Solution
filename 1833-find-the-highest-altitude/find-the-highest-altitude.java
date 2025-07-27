class Solution {
    public int largestAltitude(int[] gain) {
        
        int startPoint = 0;
        int maxHeight = 0;

        for(int i=0; i<gain.length; i++)
        {
            startPoint += gain[i];
            if(startPoint > maxHeight)
            {
                maxHeight = startPoint;
            }

        }
        return maxHeight;
    }
}