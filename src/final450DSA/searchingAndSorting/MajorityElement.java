/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 12:00 AM
 *   File: MajorityElements
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
