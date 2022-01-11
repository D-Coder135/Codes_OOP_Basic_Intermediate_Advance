package final450DSA.array;

public class VIII_LargestSumContiguousSubarray {

    long maxSubarraySum(int[] arr, int n) {

        // Your code here

        long max_sum = Integer.MIN_VALUE, max_end = 0;

        for (int i = 0; i < n; i++) {
            max_end += arr[i];
            if (max_end > max_sum) {
                max_sum = max_end;
            }
            if (max_end < 0) {
                max_end = 0;
            }
        }
        return max_sum;
    }

}
