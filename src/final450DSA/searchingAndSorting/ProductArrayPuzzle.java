/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-03-2022/03/2022
 *   Time: 06:27 PM
 *   File: ProductArrayPuzzle
 */

/**
 * GFG & LEETCODE QUESTION 238 =>
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
 * elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */

package final450DSA.searchingAndSorting;

public class ProductArrayPuzzle {
    static class Solution {
        public int[] productExceptItself(int[] nums) {
            int n = nums.length - 1;

            if (n == 1) {
                return new int[]{1};
            }

            int[] left = new int[n];
            int[] right = new int[n];
            int[] output = new int[n];

            left[0] = nums[0];
            right[n - 1] = nums[n - 1];

            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i];
            }

            for (int i = n - 2; i >= 0; i--) {
                right[i] = nums[i] * right[i + 1];
            }

            output[0] = right[1];
            output[n - 1] = left[n - 2];

            for (int i = 1; i < n - 1; i++) {
                output[i] = left[i - 1] * right[i + 1];
            }
            return output;
        }
    }
}
