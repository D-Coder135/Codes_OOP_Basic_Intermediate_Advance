/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-04-2022/04/2022
 *   Time: 12:00 AM
 *   File: ParenthesisChecker
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ParenthesisChecker {
    static class Solution {
        //Function to check if brackets are balanced or not.
        static boolean ispar(String x) {
            // add your code here
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < x.length(); i++) {
                char ch = x.charAt(i);

                if (ch == '{' || ch == '[' || ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char topChar = stack.pop();

                        if (topChar == '{' && ch == '}') {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
