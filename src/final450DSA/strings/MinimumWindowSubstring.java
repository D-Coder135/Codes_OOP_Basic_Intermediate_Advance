/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-02-2022/02/2022
 *   Time: 09:59 PM
 *   File: MinimumWindowSubstring
 */

package final450DSA.strings;

import java.util.HashMap;

public class MinimumWindowSubstring {
    static class Solution {
        public String minWindow(String s, String t) {
            HashMap<Character, Integer> map2 = new HashMap<>();

            for (int i = 0; i < t.length(); i++) {
                char ch = t.charAt(i);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            int matchCount = 0;
            int desiredMatchCount = t.length();
            HashMap<Character, Integer> map1 = new HashMap<>();
            int i = -1;
            int j = -1;
        }
    }
}
