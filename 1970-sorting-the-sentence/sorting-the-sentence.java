class Solution {
    public String sortSentence(String s) {

        // Step 1: split words by space
        String[] str = s.split(" ");
        String[] result = new String[str.length];

        // Step 2: extract position and arrange words
        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            int pos = word.charAt(word.length() - 1) - '0';
            result[pos - 1] = word.substring(0, word.length() - 1);
        }

        // Step 3: join words in order
        return String.join(" ", result);

    }
}