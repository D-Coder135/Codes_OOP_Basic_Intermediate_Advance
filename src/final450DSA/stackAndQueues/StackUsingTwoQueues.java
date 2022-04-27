/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-04-2022/04/2022
 *   Time: 11:42 PM
 *   File: StackUsingTwoQueues
 */

/**
 * GFG & LEETCODE QUESTION 225 =>
 * <p>
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support
 * all the functions of a normal stack (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means that only push to back, peek/pop from front,
 * size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively. You may simulate a queue using a
 * list or deque (double-ended queue) as long as you use only a queue's standard operations.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 2, 2, false]
 * <p>
 * Explanation
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // return 2
 * myStack.pop(); // return 2
 * myStack.empty(); // return False
 */

package final450DSA.stackAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    static class MyStack {

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();


        public MyStack() {

        }

        public void push(int x) {
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            queue1.offer(x);

            while (!queue2.isEmpty()) {
                queue1.offer(queue2.poll());
            }
        }

        public int pop() {
            if (queue1.isEmpty()) {
                return -1;
            }
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
