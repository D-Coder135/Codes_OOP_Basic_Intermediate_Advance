/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 01:16 PM
 *   File: MiddleIndexInArray
 */

package final450DSA.searchingAndSorting;

public class MiddleIndexInArray {
    static class Solution {
        public int findMiddleIndex(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }

            int totalSum = 0;
            for (int i = 0; i < nums.length; i++) {
                totalSum += nums[i];
            }

            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                totalSum -= nums[i];
            }
        }
    }
}
