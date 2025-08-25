class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
         // convert 1st word into String
      String str1 = "";
      for(int i=0; i<word1.length; i++)
      {
        String s = word1[i];
        str1 = str1 + s;
      }

      // convert 2nd word into String 
       String str2 = "";
      for(int i=0; i<word2.length; i++)
      {
        String s = word2[i];
        str2 = str2 + s;
      }

      return str1.equals(str2);
    }
}