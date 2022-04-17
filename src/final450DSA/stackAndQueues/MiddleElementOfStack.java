/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-04-2022/04/2022
 *   Time: 12:16 PM
 *   File: MiddleElementOfStack
 */

/**
 * GFG QUESTION =>
 * <p>
 * How to implement a stack which will support following operations in O(1) time complexity?
 * 1) push() which adds an element to the top of stack.
 * 2) pop() which removes an element from top of stack.
 * 3) findMiddle() which will return middle element of the stack.
 * 4) deleteMiddle() which will delete the middle element.
 * Push and pop are standard stack operations.
 * The important question is, whether to use a linked list or array for the implementation of the stack?
 * Please note that we need to find and delete the middle element. Deleting an element from the middle is not O(1)
 * for array. Also, we may need to move the middle pointer up when we push an element and move down when we pop().
 * In a singly linked list, moving the middle pointer in both directions is not possible.
 * The idea is to use Doubly Linked List (DLL). We can delete the middle element in O(1) time by
 * maintaining mid-pointer. We can move mid-pointer in both directions using previous and next pointers.
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
