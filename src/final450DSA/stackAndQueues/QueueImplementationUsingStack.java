/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 14-05-2022/05/2022
 *   Time: 09:22 PM
 *   File: QueueImplementationUsingStack
 */

/**
 * GFG & LEETCODE QUESTION 232 =>
 * <p>
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the
 * functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is
 * empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or
 * deque (double-ended queue) as long as you use only a stack's standard operations.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 * <p>
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
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
            return stack1.isEmpty() ? -1 : stack1.pop();
        }

        public int peek() {
            return stack1.isEmpty() ? -1 : stack1.peek();
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }
}
