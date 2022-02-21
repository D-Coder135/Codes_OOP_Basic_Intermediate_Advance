/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-02-2022/02/2022
 *   Time: 07:50 PM
 *   File: RomanToDecimal
 */

package final450DSA.strings;

import java.util.HashMap;

public class RomanToDecimal {
    static class Solution {
        public int romanToDecimal(String str) {
            HashMap<Character, Integer> map = new HashMap<>();

            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
        }
    }
}
