/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-02-2022/02/2022
 *   Time: 11:05 AM
 *   File: PerfectSquares
 */

package leetCodes;

public class PerfectSquares {
    static class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;

            for (int i = 2; i <= n; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j * j <= i; j++) {
                    int rem = i - (j * j);
                    if (dp[rem] < min) {
                        min = dp[rem];
                    }
                }
                dp[i] = min + 1;
            }
            return dp[n];
        }
    }
}
