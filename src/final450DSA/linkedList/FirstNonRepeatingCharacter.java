/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 13-04-2022/04/2022
 *   Time: 10:10 PM
 *   File: FirstNonRepeatingCharacter
 */

package final450DSA.linkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    static class Solution {
        public String FirstNonRepeating(String A) {
            // code here
            HashMap<Character, Integer> map = new HashMap<>();
            Queue<Character> queue = new LinkedList<>();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < A.length(); i++) {
                char ch = A.charAt(i);

                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                }
            }
        }
    }
}
