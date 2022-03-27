/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-03-2022/03/2022
 *   Time: 01:27 PM
 *   File: IntersectionOfTwoLinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given two lists sorted in increasing order, create a new list representing the intersection of the two lists.
 * The new list should be made with its own memory — the original lists should not be changed.
 * Note: The list elements are not necessarily distinct.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * L1 = 1->2->3->4->6
 * L2 = 2->4->6->8
 * Output: 2 4 6
 * Explanation: For the given first two
 * linked list, 2, 4 and 6 are the elements
 * in the intersection.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * L1 = 10->20->40->50
 * L2 = 15->40
 * Output: 40
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
                    res.next = new Node(temp1.data);
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
