/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 10:26 AM
 *   File: PairGivenDifference
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of
 * elements in the array whose difference is N.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * L = 6, N = 78
 * arr[] = {5, 20, 3, 2, 5, 80}
 * Output: 1
 * Explanation: (2, 80) have difference of 78.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * L = 5, N = 45
 * arr[] = {90, 70, 20, 80, 50}
 * Output: -1
 * Explanation: There is no pair with difference of 45.
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class PairGivenDifference {
    static class Solution {
        public boolean findPair(int[] arr, int size, int n) {
            //code here.
            Arrays.sort(arr);

            for (int i = 0; i < size; i++) {
                if (binarySearch(arr, i + 1, size - 1, arr[i] + n)) {
                    return true;
                }
            }
            return false;
        }

        private boolean binarySearch(int[] arr, int low, int high, int target) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return false;
        }
    }
}
