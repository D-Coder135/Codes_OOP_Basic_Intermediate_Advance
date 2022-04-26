/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-04-2022/04/2022
 *   Time: 06:42 PM
 *   File: LongestValidParenthesis
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
