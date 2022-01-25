/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-01-2022/01/2022
 *   Time: 01:43 PM
 *   File: XXII_MaxProductSubarray
 */

/**
 * Given an array Arr[] that contains N integers (might be positive, negative or zero). Find the product of the
 * maximum product subarray.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {6, -3, -10, 0, 2}
 * Output: 180
 * Explanation: Subarray with maximum product
 * is [6, -3, -10] which gives product as 180.
 */

package final450DSA.arrays;

public class XXII_MaxProductSubarray {
    long maxProduct(int[] arr, int n) {
        // code here
        long maxProd = 1, minProd = 1, ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                long temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(maxProd * arr[i], arr[i]);
            minProd = Math.min(minProd * arr[i], arr[i]);

            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}
