/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02-03-2022/03/2022
 *   Time: 04:55 PM
 *   File: HouseRobber
 */

/**
 * GFG QUESTION (STICKLER THIEF) & LEETCODE QUESTION 198 =>
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of
 * money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security
 * systems connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount
 * of money you can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class HouseRobber {
    static class Solution {
        public int findMaxSum(int[] arr, int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return robbed(arr, dp, 0);
        }

        private int robbed(int[] arr, int[] dp, int i) {
            if (i >= arr.length) {
                return 0;
            }

            if (dp[i] != -1) {
                return dp[i];
            }

            int robbed = arr[i] + robbed(arr, dp, i + 2);
            int notRobbed = robbed(arr, dp, i + 1);

            return dp[i] = Math.max(robbed, notRobbed);
        }
    }
}
