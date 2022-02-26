/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 02:10 PM
 *   File: GroupAnagrams
 */

/**
 * GFG & LEETCODE QUESTION 49 =>
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
 * all the original letters exactly once.
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: strs = [""]
 * Output: [[""]]
 */

package final450DSA.strings;

import java.util.*;

public class GroupAnagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<HashMap<Character, Integer>, List<String>> bigMap = new HashMap<>();

            for (String str : strs) {
                HashMap<Character, Integer> freqMap = new HashMap<>();
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                }

                if (!bigMap.containsKey(freqMap)) {
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    bigMap.put(freqMap, list);
                } else {
                    List<String> list = bigMap.get(freqMap);
                    list.add(str);
                }
            }

            List<List<String>> result = new ArrayList<>();
            for (List<String> val : bigMap.values()) {
                result.add(val);
            }
            return result;

            // Above three lines can also be directly written as =>
            // return new ArrayList<>(bigMap.values());
        }
    }
}
