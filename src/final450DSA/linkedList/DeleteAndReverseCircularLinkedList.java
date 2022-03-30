/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 01:24 PM
 *   File: DeleteAndReverseCircularLinkedList
 */

package final450DSA.linkedList;

public class DeleteAndReverseCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class GFG {
        //This method returns the head of the LL after deleting node with value d.
        public static Node deleteNode(Node head, int d) {
            //Add your code here.
            if (head == null || head.next == null) {
                return head;
            }

            Node curr = head, prev = null;

            while (curr.data != d && curr.next != head) {
                prev = curr;
                curr = curr.next;
            }

            if (curr.next != head) {
                prev.next = curr.next;
                curr.next = null;
            }
            return head;
        }

        //This method returns the head node of the reversed Linked list.
        public static Node reverse(Node head) {
            //Add your code here
            Node tail = head;

            while (tail.next != head) {
                tail = tail.next;
            }
        }
    }
}
