/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-02-2022/02/2022
 *   Time: 07:08 PM
 *   File: ReorganizeString
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

            PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();

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
