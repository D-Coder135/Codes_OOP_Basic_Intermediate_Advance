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
            char[] charArray = s.toCharArray();
            StringBuilder alt1 = new StringBuilder();
            StringBuilder alt2 = new StringBuilder();

            for (int i = 0; i < len; i++) {
                alt1.append(i % 2 == 0 ? "0" : "1");
                alt2.append(i % 2 == 0 ? "1" : "0");
            }
            int res = Integer.MAX_VALUE;
            int diff1 = 0, diff2 = 0;
            for (int i = 0; i < len + len; i++) {
                if (alt1.charAt(i) != charArray[i]) {
                    ++diff1;
                }

                if (alt2.charAt(i) != charArray[i]) {
                    ++diff2;
                }

                if (i >= len) {
                    if (alt1.charAt(i - len) != charArray[i - len]) {
                        --diff1;
                    }
                    if (alt2.charAt(i - len) != charArray[i - len]) {
                        --diff2;
                    }
                }
            }
        }
    }
}
