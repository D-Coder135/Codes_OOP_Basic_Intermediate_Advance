/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 09:44 AM
 *   File: III_ArithmeticSlices
 */

/**
 * LEETCODE QUESTION 413 =>
 * <p>
 * An integer array is called arithmetic if it consists of at least three elements and if the
 * difference between any two consecutive elements is the same.
 * <p>
 * For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
 * Given an integer array nums, return the number of arithmetic sub-arrays of nums.
 * <p>
 * A subarray is a contiguous subsequence of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: 3
 * Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 0
 */

package leetCodes.March2022;

public class III_ArithmeticSlices {
    static class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            if (nums.length < 3) {
                return 0;
            }

            int ans = 0;
            int[] dp = new int[nums.length];

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                    dp[i] = dp[i - 1] + 1;
                    ans += dp[i];
                }
            }
            return ans;
        }
    }
}
