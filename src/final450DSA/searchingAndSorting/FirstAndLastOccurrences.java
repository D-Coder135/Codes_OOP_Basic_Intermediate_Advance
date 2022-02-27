/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 10:07 PM
 *   File: FirstAndLastOccurrences
 */

/**
 * GFG & LEETCODE QUESTION 34 =>
 * <p>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a
 * given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 */

package final450DSA.searchingAndSorting;

public class FirstAndLastOccurrences {
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return new int[]{-1, -1};
            }
            int n = nums.length;
            boolean first = true;

            int firstIndex = getPosition(nums, target, n, first);
            int lastIndex = getPosition(nums, target, n, !first);

            return new int[]{firstIndex, lastIndex};
        }

        private int getPosition(int[] nums, int target, int n, boolean first) {
            int left = 0, right = n - 1;
            int ans = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    ans = mid;

                    if (first) {
                        right = mid - 1;
                    } else if (!first) {
                        left = mid + 1;
                    }
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
}
