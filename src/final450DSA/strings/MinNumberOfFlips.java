/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 03:38 PM
 *   File: MinNumberOfFlips
 */

/**
 * LEETCODE QUESTION 1888 =>
 * <p>
 * You are given a binary string s. You are allowed to perform two types of operations on the string in any sequence:
 * <p>
 * Type-1: Remove the character at the start of the string s and append it to the end of the string.
 * Type-2: Pick any character in s and flip its value, i.e., if its value is '0' it becomes '1' and vice-versa.
 * Return the minimum number of type-2 operations you need to perform such that s becomes alternating.
 * <p>
 * The string is called alternating if no two adjacent characters are equal.
 * <p>
 * For example, the strings "010" and "1010" are alternating, while the string "0100" is not.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "111000"
 * Output: 2
 * Explanation: Use the first operation two times to make s = "100011".
 * Then, use the second operation on the third and sixth elements to make s = "101010".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "010"
 * Output: 0
 * Explanation: The string is already alternating.
 */

package final450DSA.strings;

public class MinNumberOfFlips {
    static class Solution {
        public int minFlips(String s) {
            int len = s.length();
            s = s + s;
            char[] charArray = s.toCharArray();
            StringBuilder alt1 = new StringBuilder();
            StringBuilder alt2 = new StringBuilder();

            for (int i = 0; i < len + len; i++) {
                alt1.append(i % 2 == 0 ? "0" : "1");
                alt2.append(i % 2 == 0 ? "1" : "0");
            }
            int res = Integer.MAX_VALUE;
            int diff1 = 0, diff2 = 0;
            for (int i = 0; i < len + len; i++) {
                if (alt1.charAt(i) != charArray[i]) {
                    ++diff1;
                }

                if (alt2.charAt(i) != charArray[i]) {
                    ++diff2;
                }

                if (i >= len) {
                    if (alt1.charAt(i - len) != charArray[i - len]) {
                        --diff1;
                    }
                    if (alt2.charAt(i - len) != charArray[i - len]) {
                        --diff2;
                    }
                }

                if (i >= len - 1) {
                    res = Math.min(res, Math.min(diff1, diff2));
                }
            }
            return res;
        }
    }
}
