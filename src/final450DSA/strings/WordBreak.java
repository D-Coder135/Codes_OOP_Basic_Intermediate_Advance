/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 06:49 PM
 *   File: WordBreak
 */

package final450DSA.strings;

import java.util.HashMap;
import java.util.List;

public class WordBreak {
    static class Solution {
        static HashMap<String, Integer> dp = new HashMap<>();
        public boolean wordBreak(String s, List<String> wordDict) {
            int x = solve(s, wordDict);
            return x == 1;
        }

        private int solve(String s, List<String> wordDict) {
            int len = s.length();

            if (len == 0) {
                return 1;
            }

            if (dp.get(s) != 0) {
                return dp.get(s);
            }

            for (int i = 0; i < len; i++) {
                int flag = 0;
                String subString = s.substring(0, i);
            }
            return 0;
        }
    }
}
