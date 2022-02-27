/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 10:07 PM
 *   File: FirstAndLastOccurrences
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
    }
}
