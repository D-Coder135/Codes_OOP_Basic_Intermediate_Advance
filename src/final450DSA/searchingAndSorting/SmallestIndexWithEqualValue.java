/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 10:51 PM
 *   File: SmallestIndexWithEqualValue
 */

/**
 * GFG & LEETCODE QUESTION 2057 =>
 * <p>
 * Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i],
 * or -1 if such index does not exist.
 * <p>
 * x mod y denotes the remainder when x is divided by y.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,2]
 * Output: 0
 * Explanation:
 * i=0: 0 mod 10 = 0 == nums[0].
 * i=1: 1 mod 10 = 1 == nums[1].
 * i=2: 2 mod 10 = 2 == nums[2].
 * All indices have i mod 10 == nums[i], so we return the smallest index 0.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,3,2,1]
 * Output: 2
 * Explanation:
 * i=0: 0 mod 10 = 0 != nums[0].
 * i=1: 1 mod 10 = 1 != nums[1].
 * i=2: 2 mod 10 = 2 == nums[2].
 * i=3: 3 mod 10 = 3 != nums[3].
 * 2 is the only index which has i mod 10 == nums[i].
 */

package final450DSA.searchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestIndexWithEqualValue {
    static class Solution {
        public int smallestEqual(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((i % 10) == nums[i]) {
                    list.add(i);
                }
            }
            if (!list.isEmpty()) {
                Collections.sort(list);
                return list.get(0);
            }
            return -1;
        }
    }
}
