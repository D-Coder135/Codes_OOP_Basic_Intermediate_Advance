/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-04-2022/04/2022
 *   Time: 10:53 PM
 *   File: ReverseStringUsingStack
 */

/**
 * GFG QUESTION =>
 * <p>
 * You are given a string S, the task is to reverse the string using stack.
 * <p>
 * Example 1:
 * <p>
 * Input: S="GeeksforGeeks"
 * Output: skeeGrofskeeG
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ReverseStringUsingStack {
    static class Solution {

        public String reverse(String S) {
            //code here
            Stack<Character> stack = new Stack<>();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i < S.length(); i++) {
                char ch = S.charAt(i);
                stack.push(ch);
            }

            while (!stack.isEmpty()) {
                str.append(stack.pop());
            }

            return str.toString();
        }

    }
}
