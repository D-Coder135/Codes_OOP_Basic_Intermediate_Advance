/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 07:17 PM
 *   File: ThreeSum
 */

package leetCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            if (n < 3) {
                return res;
            }
            Arrays.sort(nums);

            for (int i = 0; i <= n - 3; i++) {
                if (i != 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int val = nums[i];
                List<List<Integer>> subRes = twoSum(nums, i + 1, n - 1, 0);

                for (List<Integer> list : subRes) {
                    list.add(val);
                    res.add(list);
                }
            }
            return res;
        }

        private List<List<Integer>> twoSum(int[] nums, int start, int end, int target) {
            int left = start;
            int right = end;
            List<List<Integer>> res = new ArrayList<>();
        }
    }
}
