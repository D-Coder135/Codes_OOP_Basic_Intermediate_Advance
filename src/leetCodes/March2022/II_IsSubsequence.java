/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 12:00 AM
 *   File: II_IsSubsequence
 */

package leetCodes.March2022;

public class II_IsSubsequence {
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int i = 0, j = 0;

            while (i < s.length() && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
                }
            }
        }
    }
}
