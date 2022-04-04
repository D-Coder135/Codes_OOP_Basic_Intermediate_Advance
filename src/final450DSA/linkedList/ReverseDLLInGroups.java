/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-04-2022/04/2022
 *   Time: 10:35 PM
 *   File: ReverseDLLInGroups
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a doubly linked list containing n nodes. The problem is to reverse every group of k nodes in the list.
 */

package final450DSA.linkedList;

public class ReverseDLLInGroups {

    static class Node {
        int data;
        Node next, prev;
    }

    static Node reverseByN(Node head, int k) {
        if (head == null) {
            return null;
        }

        head.prev = null;

        Node temp;
        Node curr = head;
        Node newHead = null;

        int count = 0;

        while (curr != null && count < k) {
            newHead = curr;
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
            count++;
        }

        if (count >= k) {
            Node rest = reverseByN(curr, k);
            head.next = rest;

            if (rest != null) {
                rest.prev = head;
            }
        }

        return newHead;
    }
}
