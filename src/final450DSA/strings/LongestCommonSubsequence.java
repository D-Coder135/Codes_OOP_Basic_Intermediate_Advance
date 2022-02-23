/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 10:08 PM
 *   File: LongestCommonSubsequence
 */

package final450DSA.strings;

import java.util.Arrays;

public class LongestCommonSubsequence {
    static class Solution {
        static int lcs(int x, int y, String s1, String s2) {
            int[][] dp = new int[s1.length() + 1][s2.length() + 1];
            for (int[] a : dp) {
                Arrays.fill(a, -1);
            }

            return lcsDP(s1, s2, 0, 0, dp);
        }

        private static int lcsDP(String s1, String s2, int i, int j, int[][] dp) {
            if (i == s1.length() || j == s2.length()) {
                return 0;
            }

            if (dp[i][j] != -1) {
                return dp[i][j];
            }
            return 0;
        }
    }
}
