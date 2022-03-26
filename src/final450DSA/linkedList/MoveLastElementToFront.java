/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 10:22 AM
 *   File: MoveLastElementToFront
 */

/**
 * GFG QUESTION =>
 * <p>
 * Write a function that moves the last element to the front in a given Singly Linked List. For example,
 * if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.
 */

package final450DSA.linkedList;

public class MoveLastElementToFront {
    // The structure of linked list is the following
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {
        public Node moveToFront(Node headNode) {
            if (headNode == null || headNode.next == null) {
                return headNode;
            }

            Node secondLast = null;
            Node last = headNode;

            while (last.next != null) {
                secondLast = last;
                last = last.next;
            }
            secondLast.next = null;
            last.next = headNode;
            headNode = last;

            return headNode;
        }
    }
}
