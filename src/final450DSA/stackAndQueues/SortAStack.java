/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-04-2022/04/2022
 *   Time: 04:41 PM
 *   File: SortAStack
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a stack, the task is to sort it such that the top of the stack has the greatest element.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * Stack: 3 2 1
 * Output: 3 2 1
 * <p>
 * Example 2:
 * <p>
 * Input:
 * Stack: 11 2 32 3 41
 * Output: 41 32 11 3 2
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class SortAStack {
    static class GfG {
        public Stack<Integer> sort(Stack<Integer> s) {
            //add code here.
            if (s.isEmpty()) {
                return s;
            }
            int item = s.pop();
            sort(s);
            return insertInStack(s, item);
        }

        private Stack<Integer> insertInStack(Stack<Integer> stack, int item) {
            if (stack.isEmpty()) {
                stack.push(item);
                return stack;
            }
            if (item < stack.peek()) {
                int tempItem = stack.pop();
                insertInStack(stack, item);
                stack.push(tempItem);
            } else {
                stack.push(item);
            }
            return stack;
        }
    }
}
