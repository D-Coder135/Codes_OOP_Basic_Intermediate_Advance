/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16-05-2022/05/2022
 *   Time: 02:32 PM
 *   File: CircularQueue
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
