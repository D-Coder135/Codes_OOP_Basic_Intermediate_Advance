/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the
 * maximum sum and return its sum.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 */


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
