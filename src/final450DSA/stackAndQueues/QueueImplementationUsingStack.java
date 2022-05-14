/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 14-05-2022/05/2022
 *   Time: 09:22 PM
 *   File: QueueImplementationUsingStack
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class QueueImplementationUsingStack {
    static class MyQueue {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public MyQueue() {
        }

        public void push(int x) {
            if (stack1.isEmpty()) {
                stack1.push(x);
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                stack1.push(x);
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }
        }

        public int pop() {

        }

        public int peek() {

        }

        public boolean empty() {

        }
    }
}
