/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 07:35 PM
 *   File: IsomorphicStrings
 */

package final450DSA.strings;

import java.util.HashMap;

public class IsomorphicStrings {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            return helper(s).equals(helper(t));
        }

        private String helper(String s) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {

            }
            return ans.toString();
        }
    }
}
