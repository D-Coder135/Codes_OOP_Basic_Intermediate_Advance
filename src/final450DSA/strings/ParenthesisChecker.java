/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-02-2022/02/2022
 *   Time: 03:52 PM
 *   File: ParenthesisChecker
 */

/**
 * GFG & LEETCODE QUESTION =>
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
 */

package final450DSA.strings;

import java.util.Stack;

public class ParenthesisChecker {
    static class Solution {
        //Function to check if brackets are balanced or not.
        static boolean ispar(String x) {
            // add your code here
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < x.length(); i++) {
                char character = x.charAt(i);

                if (character == '{' || character == '[' || character == '(') {
                    stack.push(character);
                } else {
                    if (stack.isEmpty()) return false;
                    else {
                        char topCharacter = stack.pop();

                        if (topCharacter == '{' && character == '}') continue;
                        else if (topCharacter == '(' && character == ')') continue;
                        else if (topCharacter == '[' && character == ']') continue;
                        else return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
