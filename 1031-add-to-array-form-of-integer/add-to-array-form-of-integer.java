class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
         List<Integer> result = new ArrayList<>();
        int i = arr.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += arr[i]; // add digit from array to k
                i--;
            }
            result.add(0, k % 10); // get last digit and add to front
            k = k / 10; // remove last digit from k
        }

        return result;
    }
}