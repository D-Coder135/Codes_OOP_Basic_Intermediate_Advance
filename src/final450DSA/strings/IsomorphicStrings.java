/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-02-2022/02/2022
 *   Time: 07:35 PM
 *   File: IsomorphicStrings
 */

/**
 * GFG & LEETCODE QUESTION 205 =>
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
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
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!map.containsKey(ch)) {
                    map.put(ch, i);
                }

                ans.append(map.get(ch));
                ans.append(" ");
            }
            return ans.toString();
        }
    }
}
