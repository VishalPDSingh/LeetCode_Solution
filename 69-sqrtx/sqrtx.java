class Solution {
    public int mySqrt(int x) {
        
        // x = (int)Math.sqrt(x);
        // return x;


         if (x < 2) return x;

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use long to avoid overflow when multiplying mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid; // store the possible answer
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}