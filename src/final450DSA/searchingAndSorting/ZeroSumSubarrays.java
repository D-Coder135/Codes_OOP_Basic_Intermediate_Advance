/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 10:48 AM
 *   File: ZeroSumSubarrays
 */

/**
 * GFG QUESTION =>
 * <p>
 * You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 6
 * arr[] = {0,0,5,5,0,0}
 * Output: 6
 * Explanation: The 6 subarrays are
 * [0], [0], [0], [0], [0,0], and [0,0].
 * <p>
 * Example 2:
 * <p>
 * Input:
 * n = 10
 * arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
 * Output: 4
 * Explanation: The 4 subarrays are [-1 -3 4]
 * [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
 */

package final450DSA.searchingAndSorting;

import java.util.HashMap;

public class ZeroSumSubarrays {
    static class Solution {
        //Function to count subarrays with sum equal to 0.
        public static long findSubarray(long[] nums, int n) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0, ans = 0;
            map.put(0, 1);
            for (long num : nums) {
                sum += num;
                if (map.containsKey(sum)) {
                    ans += map.get(sum);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            return ans;
        }
    }
}
