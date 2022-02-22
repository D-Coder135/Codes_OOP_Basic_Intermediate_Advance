/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 04:18 PM
 *   File: MinNumberOfFlips
 */

package final450DSA.strings;

public class MinNumberOfFlips {
    static class Solution {
        public int minFlips(String S) {
            int first = 0, second = 0;

            for (int i = 0; i < S.length(); i++) {
                if ((i % 2 == 0 && S.charAt(i) == '1') || (i % 2 != 0 && S.charAt(i) == '0')) {
                    first++;
                } else {
                    second++;
                }
            }
            return Math.min(first, second);
        }
    }
}
