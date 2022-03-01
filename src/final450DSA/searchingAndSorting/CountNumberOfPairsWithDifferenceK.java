/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 10:38 AM
 *   File: CountNumberOfPairsWithDifferenceK
 */

/**
 * LEETCODE QUESTION 2006 =>
 * <p>
 * Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j
 * such that |nums[i] - nums[j]| == k.
 * <p>
 * The value of |x| is defined as:
 * <p>
 * x if x >= 0.
 * -x if x < 0.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,2,1], k = 1
 * Output: 4
 * Explanation: The pairs with an absolute difference of 1 are:
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,3], k = 3
 * Output: 0
 * Explanation: There are no pairs with an absolute difference of 3.
 */

package final450DSA.searchingAndSorting;

import java.util.HashMap;

public class CountNumberOfPairsWithDifferenceK {
    static class Solution {
        public int countKDifference(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int res = 0;
            for (int num : nums) {
                res += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            return res;
        }
    }
}
