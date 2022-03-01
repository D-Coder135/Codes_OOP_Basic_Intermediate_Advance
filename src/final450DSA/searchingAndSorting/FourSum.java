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

        public static List<List<Integer>> threeSum(int[] nums, int target, int startIndex) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            if (n - startIndex < 3) {
                return res;
            }

            for (int i = startIndex; i <= n - 3; i++) {
                if (i != startIndex && nums[i] == nums[i - 1]) {
                    continue;
                }
                int val1 = nums[i];
                int targ = target - val1;
                List<List<Integer>> subRes = twoSum(nums, i + 1, n - 1, targ);

                for (List<Integer> list : subRes) {
                    list.add(val1);
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
