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
                if (temp1.data == temp2.data) {
                    Node node = new Node(temp1.data);
                    res.next = node;
                    res = res.next;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                } else if (temp1.data > temp2.data) {
                    temp2 = temp2.next;
                } else {
                    temp1 = temp1.next;
                }
            }
            return ans.next;
        }
    }
}
