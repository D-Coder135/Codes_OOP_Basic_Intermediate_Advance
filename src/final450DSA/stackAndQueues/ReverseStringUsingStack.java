/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-04-2022/04/2022
 *   Time: 10:53 PM
 *   File: ReverseStringUsingStack
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
        }

    }
}
