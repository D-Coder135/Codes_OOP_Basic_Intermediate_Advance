/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-04-2022/04/2022
 *   Time: 10:54 AM
 *   File: ValidateStackSequence
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


            }
        }
    }
}
