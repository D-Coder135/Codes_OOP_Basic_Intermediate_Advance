/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 10:32 AM
 *   File: SubarraySumEqualsK
 */

package leetCodes;

import java.util.HashMap;

public class SubarraySumEqualsK {
    static class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0, ans = 0;
            map.put(0, 1);
            for (int num : nums) {
                sum += num;
                if (map.containsKey(sum - k)) {
                    ans += map.get(sum - k);
                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
    }
}
