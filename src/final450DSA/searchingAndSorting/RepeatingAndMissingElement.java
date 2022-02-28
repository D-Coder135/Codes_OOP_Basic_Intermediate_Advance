/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 09:52 PM
 *   File: RepeatingAndMissingElement
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