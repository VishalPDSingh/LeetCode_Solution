class Solution {
    public int maximum69Number (int num) {

         // Step 1: Convert number to array of digits
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0'; // convert char to int
        }

        // Step 2: Change the first 6 to 9
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 6) {
                digits[i] = 9;
                break; // only one change allowed
            }
        }

        // Step 3: Convert array back to integer
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result * 10 + digits[i];
        }

        return result; 

    }
}