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
            StringBuilder alt2 = new StringBuilder();

            for (int i = 0; i < len; i++) {
                alt1.append(i % 2 == 0 ? "0" : "1");
                alt2.append(i % 2 == 0 ? "1" : "0");
            }
            int res = len;
            int diff1 = 0, diff2 = 0;
            int left = 0;

            for (int right = 0; right < len; right++) {
                if (s.charAt(right) != alt1.charAt(right)) {
                    diff1++;
                }
                if (s.charAt(right) != alt2.charAt(right)) {
                    diff2++;
                }

                if ((right - left + 1) > len) {
                    if (s.charAt(left) != alt1.charAt(left)) {
                        diff1--;
                    }
                    if (s.charAt(left) != alt2.charAt(left)) {
                        diff2--;
                    }
                    left++;
                }

                if ((right - left + 1) == len) {
                    res = Math.min(res, Math.min(diff1, diff2));
                }
            }
        }
    }
}
