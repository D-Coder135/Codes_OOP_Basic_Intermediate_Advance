/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-04-2022/04/2022
 *   Time: 06:42 PM
 *   File: LongestValidParenthesis
 */

/**
 * GFG & LEETCODE QUESTION 32 =>
 * <p>
 * Given a string containing just the characters '(' and ')', find the length of the longest
 * valid (well-formed) parentheses substring.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * <p>
 * Example 2:
 * <p>
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * <p>
 * Example 3:
 * <p>
 * Input: s = ""
 * Output: 0
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class LongestValidParentheses {
    static class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int maxLength = 0;

            for (int index = 0; index < s.length(); index++) {
                char ch = s.charAt(index);

                if (ch == '(') {
                    stack.push(index);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(index);
                    } else {
                        int length = index - stack.peek();
                        maxLength = Math.max(length, maxLength);
                    }
                }
            }
            return maxLength;
        }
    }
}
