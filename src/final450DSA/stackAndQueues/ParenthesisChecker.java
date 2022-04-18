/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-04-2022/04/2022
 *   Time: 12:00 AM
 *   File: ParenthesisChecker
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
 * For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * {([])}
 * Output:
 * true
 * Explanation:
 * { ( [ ] ) }. Same colored brackets can form
 * balanced pairs, with 0 number of
 * unbalanced bracket.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * ()
 * Output:
 * true
 * Explanation:
 * (). Same bracket can form balanced pairs,
 * and here only 1 type of bracket is
 * present and in balanced way.
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

                        if (topChar == '[' && ch == ']') {
                            continue;
                        }

                        if (topChar == '(' && ch == ')') {
                            continue;
                        } else {
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
