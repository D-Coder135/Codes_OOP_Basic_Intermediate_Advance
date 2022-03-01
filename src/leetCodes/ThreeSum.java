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
        public static List<List<Integer>> threeSum(int[] nums) {
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
                int target = -val;
                List<List<Integer>> subRes = twoSum(nums, i + 1, n - 1, target);

                for (List<Integer> list : subRes) {
                    list.add(val);
                    res.add(list);
                }
            }
            return res;
        }

        private static List<List<Integer>> twoSum(int[] arr, int start, int end, int target) {
            int left = start;
            int right = end;
            List<List<Integer>> res = new ArrayList<>();
            while (left < right) {
                if (left != start && arr[left] == arr[left - 1]) {
                    left++;
                    continue;
                }
                int sum = arr[left] + arr[right];

                if (sum == target) {
                    List<Integer> subRes = new ArrayList<>();
                    subRes.add(arr[left]);
                    subRes.add(arr[right]);
                    res.add(subRes);
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
            return res;
        }
    }

}
