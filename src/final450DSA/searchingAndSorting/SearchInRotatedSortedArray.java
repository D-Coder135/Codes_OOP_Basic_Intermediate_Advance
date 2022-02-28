/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 10:28 AM
 *   File: SearchInRotatedSortedArray
 */

package final450DSA.searchingAndSorting;

public class SearchInRotatedSortedArray {
    static class Solution {
        public int search(int[] nums, int target) {
            int start = 0, end = nums.length;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[0] <= nums[mid]) {
                    if (target > nums[0] && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (target >= nums[mid] && target < nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
    }
}
