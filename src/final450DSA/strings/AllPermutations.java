/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-02-2022/02/2022
 *   Time: 10:15 PM
 *   File: AllPermutations
 */

package final450DSA.strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AllPermutations {

    static class Solution {
        public List<String> find_permutation(String S) {
            // Code here
            List<String> ans = new ArrayList<>();
            solve(S, ans, "");
            Collections.sort(ans);
            return ans;
        }

        private void solve(String s, List<String> ans, String ansString) {
            if (s.length() == 0) {
                ans.add(ansString);
                return;
            }

            for (int i = 0; i < s.length(); i++) {
                String str = s.substring(0, i) + s.substring(i + 1);
                solve(str, ans, ansString + s.charAt(i));
            }
        }
    }

}
