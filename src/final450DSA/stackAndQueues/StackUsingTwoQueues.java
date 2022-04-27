/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-04-2022/04/2022
 *   Time: 11:42 PM
 *   File: StackUsingTwoQueues
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

        }
    }
}
