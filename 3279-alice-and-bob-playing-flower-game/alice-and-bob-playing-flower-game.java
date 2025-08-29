class Solution {
    public long flowerGame(int n, int m) {
        // Count odds and evens in [1..n]
        long oddX = (n + 1) / 2;   // ceil(n/2)
        long evenX = n / 2;        // floor(n/2)

        // Count odds and evens in [1..m]
        long oddY = (m + 1) / 2;   // ceil(m/2)
        long evenY = m / 2;        // floor(m/2)

        // Alice wins when (x + y) is odd
        return (evenX * oddY) + (oddX * evenY);
    }
}
