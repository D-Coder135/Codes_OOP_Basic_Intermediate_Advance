/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 10:17 PM
 *   File: NthNodeFromEnd
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
        }
    }
}
