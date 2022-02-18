/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 06:49 PM
 *   File: WordBreak
 */

package final450DSA.strings;

import java.util.List;

public class WordBreak {
    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            int x = solve(s, wordDict);
            return x == 1;
        }

        private int solve(String s, List<String> wordDict) {
            return 0;
        }
    }
}
