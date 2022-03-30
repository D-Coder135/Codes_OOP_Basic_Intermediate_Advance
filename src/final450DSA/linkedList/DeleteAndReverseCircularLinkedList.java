/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 01:24 PM
 *   File: DeleteAndReverseCircularLinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a Circular Linked List of size N. The task is to delete the given node (excluding the first and last node)
 * in the circular linked list and then print the reverse of the circular linked list.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 2 5 7 8 10
 * 8
 * <p>
 * Output:
 * 10 7 5 2
 * Explanation:
 * After deleting 8 from the given circular linked
 * list, it has elements as 2, 5, 7, 10. Now,
 * reversing this list will result in 10, 7, 5, 2.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * 4
 * 1 7 8 10
 * 8
 * <p>
 * Output:
 * 10 7 1
 * <p>
 * Explanation:
 * After deleting 8 from the given circular linked
 * list, it has elements as 1, 7,10. Now, reversing
 * this list will result in 10, 7, 1.
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
            tail.next = null;

            Node prev = null, ahead = null, curr = head;

            while (curr != null) {
                ahead = curr.next;
                curr.next = prev;
                prev = curr;
                curr = ahead;
            }
            head.next = prev;
            return prev;
        }
    }
}
