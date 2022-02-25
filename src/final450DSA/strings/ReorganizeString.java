/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-02-2022/02/2022
 *   Time: 07:08 PM
 *   File: ReorganizeString
 */

package final450DSA.strings;

public class ReorganizeString {
    static class Solution {

        public String reorganizeString(String s) {
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
            }


        }

        static class Pair {
            char character;
            int freq;
        }
    }
}
