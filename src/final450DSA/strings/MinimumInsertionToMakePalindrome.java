/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 09:50 AM
 *   File: MinimumInsertionToMakePalindrome
 */

/**
 * LEETCODE QUESTION 1312 =>
 * <p>
 * Given a string s. In one step you can insert any character at any index of the string.
 * <p>
 * Return the minimum number of steps to make s palindrome.
 * <p>
 * A Palindrome String is one that reads the same backward as well as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "zzazz"
 * Output: 0
 * Explanation: The string "zzazz" is already palindrome we don't need any insertions.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "mbadm"
 * Output: 2
 * Explanation: String can be "mbdadbm" or "mdbabdm".
 */

package final450DSA.strings;

public class MinimumInsertionToMakePalindrome {
    static class Solution {
        public int minInsertions(String s) {
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
            return s.length() - dp[0][s.length() - 1];
        }
    }
}
