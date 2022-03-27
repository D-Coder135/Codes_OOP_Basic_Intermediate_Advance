/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-03-2022/03/2022
 *   Time: 01:27 PM
 *   File: IntersectionOfTwoLinkedList
 */

package final450DSA.linkedList;

public class IntersectionOfTwoLinkedList_GFG {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Sol {
        public static Node findIntersection(Node head1, Node head2) {
            // code here.
            Node temp1 = head1, temp2 = head2;
            Node res = new Node(0);
            Node ans = res;

            while (temp1 != null && temp2 != null) {

            }
        }
    }
}
