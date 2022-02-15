/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-02-2022/02/2022
 *   Time: 06:31 PM
 *   File: LongestRepeatingSubsequence
 */

/**
 * LONGEST REPEATING SUBSEQUENCE GFG =>
 * <p>
 * Given a string str, find the length of the longest repeating subsequence such that it can be found twice in the
 * given string. The two identified subsequences A and B can use the same ith character from string str if and only if
 * that ith character has different indices in A and B.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * str = "axxxy"
 * Output: 2
 * Explanation:
 * The given array with indexes looks like
 * a x x x y
 * 0 1 2 3 4
 * <p>
 * The longest subsequence is "xx".
 * It appears twice as explained below.
 * <p>
 * subsequence A
 * x x
 * 0 1  <-- index of subsequence A
 * ------
 * 1 2  <-- index of str
 * <p>
 * <p>
 * subsequence B
 * x x
 * 0 1  <-- index of subsequence B
 * ------
 * 2 3  <-- index of str
 * <p>
 * We are able to use character 'x'
 * (at index 2 in str) in both subsequences
 * as it appears on index 1 in subsequence A
 * and index 0 in subsequence B.
 */

package final450DSA.strings;

public class LongestRepeatingSubsequence {
    static class Solution {
        public int longestRepeatingSubsequence(String str) {
            // code here
            int length = str.length();
            int[][] dp = new int[length + 1][length + 1];

            for (int i = 0; i < length; i++) {
                dp[i][0] = 0;
            }

            for (int j = 0; j < length; j++) {
                dp[0][j] = 0;
            }

            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= length; j++) {

                    if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }
            return dp[length][length];
        }
    }
}
