/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 06:57 PM
 *   File: MostCommonWord
 */

/**
 * LEETCODE QUESTION 819 =>
 * <p>
 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is
 * not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
 * <p>
 * The words in paragraph are case-insensitive and the answer should be returned in lowercase.
 * <p>
 * Example 1:
 * <p>
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * <p>
 * Example 2:
 * <p>
 * Input: paragraph = "a.", banned = []
 * Output: "a"
 */

package final450DSA.strings;

import java.util.HashMap;

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
                if (!map1.containsKey(word)) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }

            int max = 0;
            String ans = "";

            for (String key : map.keySet()) {
                if (map.get(key) >= max) {
                    ans = key;
                    max = map.get(key);
                }
            }
            return ans;
        }
    }
}
