/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-04-2022/04/2022
 *   Time: 12:16 PM
 *   File: MiddleElementOfStack
 */

package final450DSA.stackAndQueues;

public class MiddleElementOfStack {
    static class DLLNode {
        DLLNode prev;
        DLLNode next;
        int data;

        public DLLNode(int data) {
            this.data = data;
        }
    }

    static class myStack {
        DLLNode head;
        DLLNode mid;
        int count;
    }

    myStack createMyStack() {
        myStack ms = new myStack();
        ms.count = 0;
        return ms;
    }

    void push(myStack ms, int new_data) {
        DLLNode newNode = new DLLNode(new_data);
        newNode.prev = null;
        newNode.next = ms.head;
        ms.count += 1;

        if (ms.count == 1) {
            ms.mid = newNode;
        } else {
            ms.head.prev = newNode;
            if (ms.count % 2 != 0) {
                ms.mid = ms.mid.prev;
            }
        }
        ms.head = newNode;
    }

    int pop(myStack ms) {
        if (ms.count == 0) {
            return -1;
        }

        DLLNode head = ms.head;
        int item = head.data;
        ms.head = head.next;

        if (ms.head != null) {
            ms.head.prev = null;
        }

        ms.count -= 1;

        if (ms.count % 2 == 0) {
            ms.mid = ms.mid.next;
        }

        return item;
    }

    int findMiddle(myStack ms) {
        if (ms.count == 0) {
            return -1;
        }
        return ms.mid.data;
    }
}
