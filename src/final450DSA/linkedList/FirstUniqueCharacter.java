/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 13-04-2022/04/2022
 *   Time: 10:20 PM
 *   File: FirstUniqueCharacter
 */

/**
 * LEETCODE QUESTION 387 =>
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * Output: 0
 * <p>
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 */

package final450DSA.linkedList;

import java.util.HashMap;

public class FirstUniqueCharacter {
    static class Solution {
        public int firstUniqChar(String s) {
            if (s.isEmpty() || s.isBlank()) {
                return -1;
            }
            HashMap<Character, Integer> map = new HashMap<>();
            int indexAns = -1;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
