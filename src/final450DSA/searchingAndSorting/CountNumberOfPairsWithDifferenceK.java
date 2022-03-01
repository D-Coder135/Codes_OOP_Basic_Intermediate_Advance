/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 10:38 AM
 *   File: CountNumberOfPairsWithDifferenceK
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
