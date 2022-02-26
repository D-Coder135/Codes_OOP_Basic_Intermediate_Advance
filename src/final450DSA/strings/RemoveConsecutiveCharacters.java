/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 07:46 PM
 *   File: RemoveConsecutiveCharacters
 */

package final450DSA.strings;

public class RemoveConsecutiveCharacters {
    static class Solution {
        public String removeConsecutiveCharacter(String S) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (i < S.length() - 1 && S.charAt(i) == S.charAt(i + 1)) {
                    continue;
                } else {
                    res.append(S.charAt(i));
                }
            }
            return res.toString();
        }
    }
}
