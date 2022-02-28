/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 10:00 PM
 *   File: MissingNumber
 */

/**
 * LEETCODE QUESTION 256 =>
 * <p>
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
 * that is missing from the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number
 * in the range since it does not appear in nums.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number
 * in the range since it does not appear in nums.
 */

package final450DSA.searchingAndSorting;

import java.util.HashSet;

public class MissingNumber {
    static class Solution {
        public int missingNumber(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            for (int i = 0; i <= nums.length; i++) {
                if (!set.contains(i)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
