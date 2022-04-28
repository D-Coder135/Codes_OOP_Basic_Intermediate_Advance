/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-04-2022/04/2022
 *   Time: 10:54 AM
 *   File: ValidateStackSequence
 */

/**
 * GFG & LEETCODE QUESTION 946 =>
 * <p>
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been
 * the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4),
 * pop() -> 4,
 * push(5),
 * pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * <p>
 * Example 2:
 * <p>
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ValidateStackSequence {
    static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int index = 0;

            for (int element : pushed) {
                stack.push(element);

                while (!stack.isEmpty() && stack.peek() == popped[index]) {
                    stack.pop();
                    index++;
                }
            }

            return index == popped.length;
        }
    }
}
