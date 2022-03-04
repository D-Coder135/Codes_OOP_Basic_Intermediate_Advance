/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-03-2022/03/2022
 *   Time: 06:27 PM
 *   File: ProductArrayPuzzle
 */

package final450DSA.searchingAndSorting;

public class ProductArrayPuzzle {
    static class Solution {
        public int[] productExceptItself(int[] nums) {
            int n = nums.length - 1;
            int[] left = new int[n];
            int[] right = new int[n];
            int[] output = new int[n];

            left[0] = nums[0];
            right[n - 1] = nums[n - 1];

            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i];
            }
        }
    }
}
