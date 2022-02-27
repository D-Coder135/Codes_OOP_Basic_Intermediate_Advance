/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 05:57 PM
 *   File: WildcardMatching
 */

/**
 * LEETCODE QUESTION 44 (HARD) =>
 * <p>
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
 * <p>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aa", p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "aa", p = "*"
 * Output: true
 * Explanation: '*' matches any sequence.
 */

package final450DSA.strings;

public class WildcardMatching {
    static class Solution {
        public boolean isMatch(String s, String p) {
            boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
            for (int i = dp.length - 1; i >= 0; i--) {
                for (int j = dp[0].length - 1; j >= 0; j--) {
                    if (i == dp.length - 1 && j == dp[0].length - 1) {
                        dp[i][j] = true;
                    } else if (i == dp.length - 1) {
                        dp[i][j] = false;
                    } else if (j == dp[0].length - 1) {
                        if (p.charAt(i) == '*') {
                            dp[i][j] = dp[i + 1][j];
                        } else {
                            dp[i][j] = false;
                        }
                    } else {
                        if (p.charAt(i) == '?') {
                            dp[i][j] = dp[i + 1][j + 1];
                        } else if (p.charAt(i) == '*') {
                            dp[i][j] = dp[i + 1][j] || dp[i][j + 1];
                        } else if (p.charAt(i) == s.charAt(j)) {
                            dp[i][j] = dp[i + 1][j + 1];
                        } else {
                            dp[i][j] = false;
                        }
                    }
                }
            }
            return dp[0][0];
        }
    }
}
