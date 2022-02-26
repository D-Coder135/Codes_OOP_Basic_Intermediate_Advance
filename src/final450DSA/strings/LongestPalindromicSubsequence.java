/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 10:26 AM
 *   File: LongestPalindromicSubsequence
 */

/**
 * LEETCODE QUESTION 516 =>
 * <p>
 * Given a string s, find the longest palindromic subsequence's length in s.
 * <p>
 * A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without
 * changing the order of the remaining elements.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "bbbab"
 * Output: 4
 * Explanation: One possible longest palindromic subsequence is "bbbb".
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: 2
 * Explanation: One possible longest palindromic subsequence is "bb".
 */

package final450DSA.strings;

public class LongestPalindromicSubsequence {
    static class Solution {
        public int longestPalindromeSubseq(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int gap = 0; gap < s.length(); gap++) {
                for (int i = 0, j = gap; j < dp.length; i++, j++) {
                    if (gap == 0) {
                        dp[i][j] = 1;
                    } else if (gap == 1) {
                        dp[i][j] = s.charAt(i) == s.charAt(j) ? 2 : 1;
                    } else {
                        if (s.charAt(i) == s.charAt(j)) {
                            dp[i][j] = 2 + dp[i + 1][j - 1];
                        } else {
                            dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                        }
                    }
                }
            }
            return dp[0][s.length() - 1];
        }
    }
}
