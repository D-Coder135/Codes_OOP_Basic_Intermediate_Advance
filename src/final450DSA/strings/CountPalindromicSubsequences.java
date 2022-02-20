/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-02-2022/02/2022
 *   Time: 04:46 PM
 *   File: CountPalindromicSubsequences
 */

package final450DSA.strings;

public class CountPalindromicSubsequences {
    static class Solution {
        public int countPS(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int gap = 0; gap < s.length(); gap++) {
                for (int i = 0, j = gap; j < s.length(); i++, j++) {
                    if (gap == 0) {
                        dp[i][j] = 1;
                    } else if (gap == 1) {
                        dp[i][j] = (s.charAt(i) == s.charAt(j) ? 3 : 2);
                    } else {
                        if (s.charAt(i) == s.charAt(j)) {
                            dp[i][j] = (dp[i][j - 1] + dp[i + 1][j] + 1) % 1000000007;
                        } else {

                        }
                    }
                }
            }
        }
    }
}
