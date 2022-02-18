/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 09:41 PM
 *   File: WordBreak2
 */

package final450DSA.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {
    static class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<>(wordDict);
            return wordBreakHelper(s, 0, set);
        }

        private List<String> wordBreakHelper(String s, int start, HashSet<String> set) {
            List<String> validSubStr = new ArrayList<>();

            if (start == s.length()) {
                validSubStr.add("");
            }
            for (int end = start + 1; end <= s.length(); end++) {
                String prefix = s.substring(start, end);
                if (set.contains(prefix)) {
                    List<String> suffixes = wordBreakHelper(s, end, set);
                }
            }
            return null;
        }
    }
}
