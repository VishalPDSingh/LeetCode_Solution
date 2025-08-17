class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0) return 1.0; // No draws; 0 points is ≤ n
        // Max possible final score if we stop as soon as reaching k: (k-1) + maxPts
        if (n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double windowSum = 0.0;  // sum of dp[i-1], dp[i-2], ..., dp[i-maxPts] for i
        double ans = 0.0;

        // Build dp[1..n]
        for (int i = 1; i <= n; i++) {
            // Add dp[i-1] to window if (i-1) can still draw (i.e., < k)
            if (i - 1 < k) windowSum += dp[i - 1];
            // Remove dp[i - 1 - maxPts] if it falls out of the window and < k
            if (i - 1 - maxPts >= 0 && i - 1 - maxPts < k) windowSum -= dp[i - 1 - maxPts];

            dp[i] = windowSum / maxPts;

            // If we've already reached stopping condition at i (i >= k), it contributes to the answer
            if (i >= k) ans += dp[i];
        }
        return ans;
    }
}
