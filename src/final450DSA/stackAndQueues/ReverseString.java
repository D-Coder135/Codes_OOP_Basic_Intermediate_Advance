/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 06:26 PM
 *   File: ReverseString
 */

/**
 * LEETCODE QUESTION 344 =>
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * Example 2:
 * <p>
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ReverseString {
    static class Solution {
        public void reverseString(char[] s) {
            Stack<Character> stack = new Stack<>();
            for (char character : s) {
                stack.push(character);
            }

            int index = 0;
            while (!stack.isEmpty()) {
                s[index++] = stack.pop();
            }
        }
    }
}
