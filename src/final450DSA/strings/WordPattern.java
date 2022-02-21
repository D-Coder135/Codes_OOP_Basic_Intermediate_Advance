/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-02-2022/02/2022
 *   Time: 07:34 PM
 *   File: WordPattern
 */

/**
 * LEETCODE QUESTION 290 =>
 * <p>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 */

package final450DSA.strings;

import java.util.HashMap;

public class WordPattern {
    static class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");

            if (words.length != pattern.length()) {
                return false;
            }

            HashMap<Character, String> map = new HashMap<>();
            HashMap<String, Boolean> used = new HashMap<>();

            for (int i = 0; i < pattern.length(); i++) {
                char character = pattern.charAt(i);

                if (!map.containsKey(character)) {
                    if (used.containsKey(words[i])) {
                        return false;
                    } else {
                        used.put(words[i], true);
                        map.put(character, words[i]);
                    }
                } else {
                    String mapWith = map.get(character);
                    if (!mapWith.equals(words[i])) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
