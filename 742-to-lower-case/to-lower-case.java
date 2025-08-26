class Solution {
    public String toLowerCase(String s) {

        String str = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c>='A' && c<='Z')
            {
                str= str + (char)(c+32);
            }
            else
            {
                str = str+c;
            }
        }
        return str;
    }
}