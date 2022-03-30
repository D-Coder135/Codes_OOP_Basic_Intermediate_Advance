/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 02:19 PM
 *   File: ReverseDoublyLinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a doubly linked list of n elements. The task is to reverse the doubly linked list.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 3 <--> 4 <--> 5
 * Output: 5 4 3
 * <p>
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 75 <--> 122 <--> 59 <--> 196
 * Output: 196 59 122 75
 */

package final450DSA.linkedList;

public class ReverseDoublyLinkedList {
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class GFG {
        public static Node reverseDLL(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node curr = head, temp = null;

            while (curr != null) {
                temp = curr.prev;
                curr.prev = curr.next;
                curr.next = temp;

                curr = curr.prev;
            }

            return temp.prev;
        }
    }
}
