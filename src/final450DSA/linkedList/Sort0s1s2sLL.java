/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 07-04-2022/04/2022
 *   Time: 04:39 PM
 *   File: Sort0s1s2sLL
 */

package final450DSA.linkedList;

public class Sort0s1s2sLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Solution {
        //Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head) {
            // add your code here

            if (head == null || head.next == null) {
                return head;
            }

            Node curr = head;
            Node h0, h1, h2, t0, t1, t2;
            h0 = h1 = h2 = t0 = t1 = t2 = null;

            while (curr != null) {
                if (curr.data == 0) {
                    if (h0 == null) {
                        h0 = curr;
                        t0 = curr;
                    } else {
                        t0.next = curr;
                        t0 = t0.next;
                    }
                } else if (curr.data == 1) {
                    if (h1 == null) {
                        h1 = curr;
                        t1 = curr;
                    } else {
                        t1.next = curr;
                        t1 = t1.next;
                    }
                } else if (curr.data == 2) {
                    if (h2 == null) {
                        h2 = curr;
                        t2 = curr;
                    } else {
                        t2.next = curr;
                        t2 = t2.next;
                    }
                }

                curr = curr.next;
            }
        }
    }

}
