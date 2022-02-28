/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 12:00 AM
 *   File: MajorityElements
 */

/**
 * GFG & LEETCODE QUESTION 169 =>
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the
 * majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

package final450DSA.searchingAndSorting;

import java.util.HashMap;

public class MajorityElement {
    static class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (Integer key : map.keySet()) {
                if (map.get(key) > (nums.length / 2)) {
                    return key;
                }
            }
            return -1;
        }
    }
}
