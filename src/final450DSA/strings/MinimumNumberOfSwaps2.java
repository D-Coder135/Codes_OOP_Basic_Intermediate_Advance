/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 09:11 PM
 *   File: MinimumNumberOfSwaps2
 */

package final450DSA.strings;

import java.util.Stack;

public class MinimumNumberOfSwaps2 {
    static class Solution {
        public int minSwaps(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (ch == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(ch);
                        }
                    } else {
                        stack.push(ch);
                    }
                }
            }
            return (stack.size() / 4) + (stack.size() % 4 == 0 ? 0 : 1);
        }
    }
}
