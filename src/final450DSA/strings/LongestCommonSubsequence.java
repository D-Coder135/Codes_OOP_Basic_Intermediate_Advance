/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 10:08 PM
 *   File: LongestCommonSubsequence
 */

/**
 * GFG QUESTION & LEETCODE QUESTION 1143 =>
 * <p>
 * Given two sequences, find the length of longest subsequence present in both of them. Both the strings are of uppercase.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * A = 6, B = 6
 * str1 = ABCDGH
 * str2 = AEDFHR
 * Output: 3
 * Explanation: LCS for input Sequences
 * “ABCDGH” and “AEDFHR” is “ADH” of
 * length 3.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * A = 3, B = 2
 * str1 = ABC
 * str2 = AC
 * Output: 2
 * Explanation: LCS of "ABC" and "AC" is
 * "AC" of length 2.
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

            int ans = 0;
            if (s1.charAt(i) == s2.charAt(j)) {
                ans = 1 + lcsDP(s1, s2, i + 1, j + 1, dp);
            } else {
                int fstr1 = lcsDP(s1, s2, i + 1, j, dp);
                int fstr2 = lcsDP(s1, s2, i, j + 1, dp);
                ans = Math.max(fstr1, fstr2);
            }

            return dp[i][j] = ans;
        }
    }
}
