/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02-03-2022/03/2022
 *   Time: 06:38 PM
 *   File: HouseRobber2
 */

package leetCodes;

import java.util.Arrays;

public class HouseRobber2 {
    static class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            return Math.max(helper(nums, 0, nums.length - 1), helper(nums, 1, nums.length));
        }

        private int helper(int[] nums, int start, int end) {
            int max = 0, prevTwo = 0, prevOne = 0;
            for (int i = start; i < end; i++) {
                max = Math.max(prevTwo + nums[i], prevOne);
                prevTwo = prevOne;
                prevOne = max;
            }
            return max;
        }
    }
}
