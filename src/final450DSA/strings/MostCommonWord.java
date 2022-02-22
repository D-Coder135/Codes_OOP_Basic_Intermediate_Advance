/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 06:57 PM
 *   File: MostCommonWord
 */

package final450DSA.strings;

import java.util.HashMap;
import java.util.Locale;

public class MostCommonWord {
    static class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {

            String lowerCase = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
            HashMap<String, Integer> map = new HashMap<>();
            HashMap<String, Integer> map1 = new HashMap<>();
            String[] words = lowerCase.split("\\s+");

            for (int i = 0; i < banned.length; i++) {
                map1.put(banned[i], i + 1);
            }

            for (String word : words) {
                if (!map.containsKey(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            int max = 0;
            String ans = "";

            for (String key : map.keySet()) {
                if (map.get(key) >= max) {

                }
            }
        }
    }
}
