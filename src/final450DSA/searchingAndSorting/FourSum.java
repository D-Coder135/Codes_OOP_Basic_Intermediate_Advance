/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 09:58 PM
 *   File: FourSum
 */

package final450DSA.searchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            if (n < 4) {
                return res;
            }
            Arrays.sort(nums);
            for (int i = 0; i <= n - 4; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int val = nums[i];
                List<List<Integer>> subRes = threeSum(nums, target - val, i + 1);

                for (List<Integer> list : subRes) {
                    list.add(val);
                    res.add(list);
                }
            }
            return res;
        }
    }
}
