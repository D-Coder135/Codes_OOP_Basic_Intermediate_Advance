/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 10:26 AM
 *   File: LongestPalindromicSubsequence
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
                            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
    }
}
