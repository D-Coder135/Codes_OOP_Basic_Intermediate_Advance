/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-02-2022/02/2022
 *   Time: 06:31 PM
 *   File: LongestRepeatingSubsequence
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
        }
    }
}
