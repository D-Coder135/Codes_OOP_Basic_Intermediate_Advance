/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 10:48 AM
 *   File: ZeroSumSubarrays
 */

package final450DSA.searchingAndSorting;

import java.util.HashMap;

public class ZeroSumSubarrays {
    static class Solution {
        //Function to count subarrays with sum equal to 0.
        public static long findSubarray(long[] nums, int n) {
            //Your code here
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
