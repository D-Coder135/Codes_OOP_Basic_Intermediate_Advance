/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 09:41 PM
 *   File: WordBreak2
 */

package final450DSA.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {
    static class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<>(wordDict);
            HashMap<Integer, List<String>> map = new HashMap<>(); // For DP
//            return wordBreakHelper(s, 0, set);
            return wordBreakDp(s, 0, set, map);
        }

        // Using Recursion (Backtracking)
        private List<String> wordBreakHelper(String s, int start, HashSet<String> set) {
            List<String> validSubStr = new ArrayList<>();

            if (start == s.length()) {
                validSubStr.add("");
            }
            for (int end = start + 1; end <= s.length(); end++) {
                String prefix = s.substring(start, end);
                if (set.contains(prefix)) {
                    List<String> suffixes = wordBreakHelper(s, end, set);

                    for (String suffix : suffixes) {
                        validSubStr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                    }
                }
            }
            return validSubStr;
        }

        // Using DP (More Optimized Solution)
        private List<String> wordBreakDp(String s, int start, HashSet<String> set, HashMap<Integer, List<String>> map) {
            List<String> validSubStr = new ArrayList<>();


            if (start == s.length()) {
                validSubStr.add("");
            }

            if (map.containsKey(start)) {
                return map.get(start);
            }
            for (int end = start + 1; end <= s.length(); end++) {
                String prefix = s.substring(start, end);
                if (set.contains(prefix)) {
                    List<String> suffixes = wordBreakDp(s, end, set, map);

                    for (String suffix : suffixes) {
                        validSubStr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                    }
                }
            }
            map.put(start, validSubStr);
            return validSubStr;
        }
    }
}
