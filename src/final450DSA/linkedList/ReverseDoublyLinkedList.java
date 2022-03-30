/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 02:19 PM
 *   File: ReverseDoublyLinkedList
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
