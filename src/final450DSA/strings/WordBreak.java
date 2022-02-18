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
            if (wordDict.contains(s))
                return true;
            for (int i = 0; i < s.length(); i++) {
                String sub = s.substring(0, i);
                if (wordDict.contains(sub) && wordBreak(s.substring(i), wordDict))
                    return true;
            }
            return false;
        }
    }
}
