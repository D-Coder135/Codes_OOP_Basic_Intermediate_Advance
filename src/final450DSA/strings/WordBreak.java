/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 06:49 PM
 *   File: WordBreak
 */

/**
 * GFG & LEETCODE QUESTION 139 =>
 * <p>
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated
 * sequence of one or more dictionary words.
 * <p>
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
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
            if (map.containsKey(s)) {
                return map.get(s);
            }
            for (int i = 1; i <= s.length(); i++) {
                String sub = s.substring(0, i);
                if (wordDict.contains(sub) && wordBreakDP(s.substring(i), wordDict)) {
                    map.put(s, true);
                    return true;
                }
            }
            map.put(s, false);
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
