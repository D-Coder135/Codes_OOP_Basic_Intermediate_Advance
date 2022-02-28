/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 01:16 PM
 *   File: MiddleIndexInArray
 */

/**
 * LEETCODE QUESTION 1991 =>
 * <p>
 * Given a 0-indexed integer array nums, find the leftmost middleIndex
 * (i.e., the smallest amongst all the possible ones).
 * <p>
 * A middleIndex is an index where
 * nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 * <p>
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1,
 * the right side sum is considered to be 0.
 * <p>
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,-1,8,4]
 * Output: 3
 * Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
 * The sum of the numbers after index 3 is: 4 = 4
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,-1,4]
 * Output: 2
 * Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
 * The sum of the numbers after index 2 is: 0
 */

package final450DSA.searchingAndSorting;

public class MiddleIndexInArray {
    static class Solution {
        public int findMiddleIndex(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }

            int totalSum = 0;
            for (int num : nums) {
                totalSum += num;
            }

            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                totalSum -= nums[i];
                if (leftSum == totalSum) {
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }
    }
}
