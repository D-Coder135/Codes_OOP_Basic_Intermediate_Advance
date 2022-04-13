/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 13-04-2022/04/2022
 *   Time: 10:20 PM
 *   File: FirstUniqueCharacter
 */

package final450DSA.linkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
