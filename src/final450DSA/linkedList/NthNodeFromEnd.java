/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 10:17 PM
 *   File: NthNodeFromEnd
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node from
 * the end of the linked list.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * LinkedList: 1->2->3->4->5->6->7->8->9
 * Output: 8
 * Explanation: In the first example, there
 * are 9 nodes in linked list and we need
 * to find 2nd node from end. 2nd node
 * from end os 8.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * LinkedList: 10->5->100->5
 * Output: -1
 * Explanation: In the second example, there
 * are 4 nodes in the linked list and we
 * need to find 5th from the end. Since 'n'
 * is more than the number of nodes in the
 * linked list, the output is -1.
 */

package final450DSA.linkedList;

public class NthNodeFromEnd {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class GfG {
        //Function to find the data of nth node from the end of a linked list.
        int getNthFromLast(Node head, int n) {
            // Your code here
            Node temp = head;
            int length = 0;

            while (temp != null) {
                temp = temp.next;
                length++;
            }

            temp = head;
            int diff = length - n;

            if (diff < 0) {
                return -1;
            }

            while (diff-- > 0) {
                temp = temp.next;
            }

            return temp.data;
        }
    }
}
