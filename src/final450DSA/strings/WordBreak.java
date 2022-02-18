/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 06:49 PM
 *   File: WordBreak
 */

package final450DSA.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    static class Solution {
        // RECURSIVE APPROACH: TLE ERROR
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

        // Optimized Approach DP
        Map<String, Boolean> map = new HashMap<>();
        public boolean wordBreakDP(String s, List<String> wordDict) {
            if (wordDict.contains(s))
                return true;
            for (int i = 0; i < s.length(); i++) {
                String sub = s.substring(0, i);
                if (wordDict.contains(sub) && wordBreakDP(s.substring(i), wordDict))
                    return true;
            }
            return false;
        }
    }

    // GFG SOLUTION: Recursive Approach
    static class Sol {
        public static int wordBreak(String s, ArrayList<String> wordDict) {
            //code here
            if (wordDict.contains(s))
                return 1;
            for (int i = 0; i < s.length(); i++) {
                String sub = s.substring(0, i);
                if (wordDict.contains(sub) && wordBreak(s.substring(i), wordDict) == 1)
                    return 1;
            }
            return 0;
        }
    }
}
