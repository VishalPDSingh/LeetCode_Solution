class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != c) {
                    return result.toString();
                }
            }

            result.append(c);
        }

        return result.toString();
    }
}
