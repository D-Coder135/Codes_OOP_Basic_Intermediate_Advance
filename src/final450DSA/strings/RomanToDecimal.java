/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-02-2022/02/2022
 *   Time: 07:50 PM
 *   File: RomanToDecimal
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their
 * values are given below.
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s = V
 * Output: 5
 * <p>
 * Example 2:
 * <p>
 * Input:
 * s = III
 * Output: 3
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

            int result = map.get(str.charAt(str.length() - 1));

            for (int i = str.length() - 2; i >= 0; i--) {
                if (str.charAt(i) < str.charAt(i + 1)) {
                    result -= map.get(str.charAt(i));
                } else {
                    result += map.get(str.charAt(i));
                }
            }
            return result;
        }
    }
}
