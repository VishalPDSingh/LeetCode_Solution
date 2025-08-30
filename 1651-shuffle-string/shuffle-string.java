class Solution {
    public String restoreString(String s, int[] index) {
        
        char ch[] = new char[s.length()];

        for(int i=0; i<s.length(); i++)
        {
            ch[index[i]] = s.charAt(i);
        }
        return new String (ch);
    }
}