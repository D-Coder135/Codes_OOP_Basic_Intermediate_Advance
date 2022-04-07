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
            Node head0, head1, head2, temp0, temp1, temp2;
            head0 = head1 = head2 = temp0 = temp1 = temp2 = null;

            while (curr != null) {
                if (curr.data == 0) {
                    if (head0 == null) {
                        head0 = curr;
                        temp0 = curr;
                    } else {
                        temp0.next = curr;
                        temp0 = temp0.next;
                    }
                } else if (curr.data == 1) {
                    if (head1 == null) {
                        head1 = curr;
                        temp1 = curr;
                    } else {
                        temp1.next = curr;
                        temp1 = temp1.next;
                    }
                } else if (curr.data == 2) {
                    if (head2 == null) {
                        head2 = curr;
                        temp2 = curr;
                    } else {
                        temp2.next = curr;
                        temp2 = temp2.next;
                    }
                }

                curr = curr.next;
            }

            if (head0 == null) {
                if (head1 == null) {
                    if (head2 == null) {
                        return head;
                    } else {
                        temp2.next = null;
                        return head2;
                    }
                } else {
                    if (head2 == null) {
                        temp1.next = null;
                        return head1;
                    } else {
                        temp1.next = head2;
                        temp2.next = null;
                        return head1;
                    }
                }
            } else {
                if (head1 == null) {
                    if (head2 == null) {
                        temp0.next = null;
                        return head0;
                    } else {
                        temp0.next = head2;
                        temp2.next = null;
                        return head0;
                    }
                } else {
                    if (head2 == null) {
                        temp0.next = head1;
                        temp1.next = null;
                        return head0;
                    } else {
                        temp0.next = head1;
                        temp1.next = head2;
                        temp2.next = null;
                        return head0;
                    }
                }
            }
        }
    }

}
