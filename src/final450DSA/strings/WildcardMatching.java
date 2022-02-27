/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 05:57 PM
 *   File: WildcardMatching
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
                    }
                }
            }
        }
    }
}
