/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 03:38 PM
 *   File: MinNumberOfFlips
 */

package final450DSA.strings;

public class MinNumberOfFlips {
    static class Solution {
        public int minFlips(String s) {
            int len = s.length();
            s = s + s;
            StringBuilder alt1 = new StringBuilder();
            String alt2 = "";

            for (int i = 0; i < len; i++) {
                alt1.append(i % 2 == 0 ? "0" : "1");
            }
        }
    }
}
