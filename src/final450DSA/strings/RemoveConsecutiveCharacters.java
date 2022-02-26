/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 07:46 PM
 *   File: RemoveConsecutiveCharacters
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a string S delete the characters which are appearing more than once consecutively.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = aabb
 * Output:  ab
 * Explanation: 'a' at 2nd position is
 * appearing 2nd time consecutively.
 * Similiar explanation for b at
 * 4th position.
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
