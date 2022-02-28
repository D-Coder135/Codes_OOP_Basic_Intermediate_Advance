/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 09:52 PM
 *   File: RepeatingAndMissingElement
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing
 * and one number 'B' occurs twice in array. Find these two numbers.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * Arr[] = {2, 2}
 * Output: 2 1
 * Explanation: Repeating number is 2 and
 * smallest positive missing number is 1.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 3
 * Arr[] = {1, 3, 3}
 * Output: 3 2
 * Explanation: Repeating number is 3 and
 * smallest positive missing number is 2.
 */

package final450DSA.searchingAndSorting;

public class RepeatingAndMissingElement {
    static class Solution {
        int[] findTwoElement(int[] arr, int n) {
            int repeating = 0, missing = 0;
            for (int i = 0; i < n; i++) {
                if (arr[Math.abs(arr[i]) - 1] < 0) {
                    repeating = Math.abs(arr[i]);
                } else {
                    arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    missing = i + 1;
                }
            }
            return new int[]{repeating, missing};
        }
    }
}
