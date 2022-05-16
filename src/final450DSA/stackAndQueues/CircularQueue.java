/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16-05-2022/05/2022
 *   Time: 02:32 PM
 *   File: CircularQueue
 */

/**
 * GFG & LEETCODE QUESTION 622 =>
 * <p>
 * Design your implementation of the circular queue. The circular queue is a linear data structure in which the
 * operations are performed based on FIFO (First In First Out) principle and the last position is connected back
 * to the first position to make a circle. It is also called "Ring Buffer".
 * <p>
 * One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a
 * normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front
 * of the queue. But using the circular queue, we can use the space to store new values.
 * <p>
 * Implementation the MyCircularQueue class:
 * <p>
 * MyCircularQueue(k) Initializes the object with the size of the queue to be k.
 * int Front() Gets the front item from the queue. If the queue is empty, return -1.
 * int Rear() Gets the last item from the queue. If the queue is empty, return -1.
 * boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.
 * boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.
 * boolean isEmpty() Checks whether the circular queue is empty or not.
 * boolean isFull() Checks whether the circular queue is full or not.
 * You must solve the problem without using the built-in queue data structure in your programming language.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
 * [[3], [1], [2], [3], [4], [], [], [], [4], []]
 * Output
 * [null, true, true, true, false, 3, true, true, true, 4]
 * <p>
 * Explanation
 * MyCircularQueue myCircularQueue = new MyCircularQueue(3);
 * myCircularQueue.enQueue(1); // return True
 * myCircularQueue.enQueue(2); // return True
 * myCircularQueue.enQueue(3); // return True
 * myCircularQueue.enQueue(4); // return False
 * myCircularQueue.Rear();     // return 3
 * myCircularQueue.isFull();   // return True
 * myCircularQueue.deQueue();  // return True
 * myCircularQueue.enQueue(4); // return True
 * myCircularQueue.Rear();     // return 4
 */

package final450DSA.stackAndQueues;

public class CircularQueue {
    static class MyCircularQueue {
        final int[] arr;
        int front = 0, rear = -1, size = 0;

        public MyCircularQueue(int k) {
            arr = new int[k];
        }

        public boolean enQueue(int value) {
            if (!isFull()) {
                rear = (rear + 1) % arr.length;
                arr[rear] = value;
                size++;
                return true;
            } else {
                return false;
            }
        }

        public boolean deQueue() {
            if (!isEmpty()) {
                front = (front + 1) % arr.length;
                size--;
                return true;
            } else {
                return false;
            }
        }

        public int Front() {
            return isEmpty() ? -1 : arr[front];
        }

        public int Rear() {
            return isEmpty() ? -1 : arr[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == arr.length;
        }
    }
}
