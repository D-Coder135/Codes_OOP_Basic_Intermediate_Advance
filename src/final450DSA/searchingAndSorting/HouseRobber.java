/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02-03-2022/03/2022
 *   Time: 04:55 PM
 *   File: HouseRobber
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class HouseRobber {
    static class Solution {
        public int findMaxSum(int[] arr, int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            return robbed(arr, dp, 0);
        }

        private int robbed(int[] arr, int[] dp, int i) {
            if (i >= arr.length) {
                return 0;
            }

            if (dp[i] != -1) {
                return dp[i];
            }

            int robbed = arr[i] + robbed(arr, dp, i + 2);
            int notRobbed = robbed(arr, dp, i + 1);
        }
    }
}
