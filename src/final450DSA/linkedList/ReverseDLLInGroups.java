/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-04-2022/04/2022
 *   Time: 10:35 PM
 *   File: ReverseDLLInGroups
 */

package final450DSA.linkedList;

import org.w3c.dom.Node;

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

    }
}
