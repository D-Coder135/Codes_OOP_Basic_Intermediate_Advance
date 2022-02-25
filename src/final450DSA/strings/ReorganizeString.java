/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-02-2022/02/2022
 *   Time: 07:08 PM
 *   File: ReorganizeString
 */

/**
 * GFG QUESTION LEETCODE QUESTION 767 (AMAZON)=>
 * <p>
 * Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
 * <p>
 * Return any possible rearrangement of s or return "" if not possible.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aab"
 * Output: "aba"
 * <p>
 * Example 2:
 * <p>
 * Input: s = "aaab"
 * Output: ""
 */

package final450DSA.strings;

import java.util.PriorityQueue;

public class ReorganizeString {
    static class Solution {

        public String reorganizeString(String s) {
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
            }

            PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> (b.freq - a.freq));

            for (int i = 0; i < map.length; i++) {
                if (map[i] > 0) {
                    priorityQueue.add(new Pair((char) ('a' + i), map[i]));
                }
            }

            StringBuilder ans = new StringBuilder();
            Pair block = priorityQueue.poll();
            ans.append(block.character);
            block.freq--;

            while (priorityQueue.size() > 0) {
                Pair temp = priorityQueue.poll();
                ans.append(temp.character);
                temp.freq--;

                if (block.freq > 0) {
                    priorityQueue.add(block);
                }
                block = temp;
            }

            if (block.freq > 0) {
                return "";
            }

            return ans.toString();
        }

        static class Pair {
            char character;
            int freq;

            public Pair(char character, int freq) {
                this.character = character;
                this.freq = freq;
            }
        }
    }
}
