/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-02-2022/02/2022
 *   Time: 07:34 PM
 *   File: WordPattern
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
                }
            }
        }
    }
}
