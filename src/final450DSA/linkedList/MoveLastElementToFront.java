/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 10:22 AM
 *   File: MoveLastElementToFront
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

        }
    }
}
