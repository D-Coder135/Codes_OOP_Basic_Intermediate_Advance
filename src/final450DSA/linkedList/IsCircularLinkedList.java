/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 29-03-2022/03/2022
 *   Time: 02:12 PM
 *   File: IsCircularLinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given head, the head of a singly linked list, find if the linked list is circular or not.
 * A linked list is called circular if it is not NULL terminated and all nodes are connected in the form of a cycle.
 * An empty linked list is considered as circular.
 * <p>
 * Note: The linked list does not contain any inner loop.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 1->2->3->4->5
 * (the first and last node is connected,
 * i.e. 5 --> 1)
 * Output: 1
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 2->4->6->7->5->1
 * Output: 0
 */

package final450DSA.linkedList;

public class IsCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class GfG {
        boolean isCircular(Node head) {
            // Your code here
            if (head == null || head.next == null) {
                return false;
            }

            Node temp = head;

            while (temp != null) {
                temp = temp.next;

                if (temp == head) {
                    return true;
                }
            }
            return false;
        }
    }
}
