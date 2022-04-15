/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15-04-2022/04/2022
 *   Time: 10:43 PM
 *   File: StackImplementation
 */

package final450DSA.stackAndQueues;

public class StackImplementation {
    private int maxSize;
    private int top;
    private long[] stackArray;

    public StackImplementation(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == maxSize - 1;
    }
}
