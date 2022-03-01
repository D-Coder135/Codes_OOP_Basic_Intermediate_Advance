/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 02:24 PM
 *   File: I_CountingBits
 */

package leetCodes.March2022;

public class I_CountingBits {
    static class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            ans[0] = 0;

            for (int i = 1; i <= n; i++) {
                ans[i] = ans[i / 2] + i % 2;
            }
            return ans;
        }
    }
}
