/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-04-2022/04/2022
 *   Time: 11:14 PM
 *   File: QueueImplementation
 */

package final450DSA.stackAndQueues;

public class QueueImplementation {
    int front, rear, size, capacity;
    int[] array;

    public QueueImplementation(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(QueueImplementation queue) {
        return queue.size == queue.capacity;
    }

    boolean isEmpty(QueueImplementation queue) {
        return queue.size == 0;
    }

    void enqueue(int item) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    int dequeue() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        }

        int item = this.array[this.front];

    }
}
