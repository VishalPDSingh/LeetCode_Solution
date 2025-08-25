class Solution {
    public String restoreString(String s, int[] index) {
        
        char res[] = new char[s.length()];

       for(int i=0; i<s.length(); i++)
       {
         res[index[i]] = s.charAt(i);
       }
        return new String(res);  // convert array back to string
    }
}