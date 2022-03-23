/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 12:05 AM
 *   File: ReverseNodesInKGroupsGFG
 */

package final450DSA.linkedList;

public class ReverseNodesInKGroupsGFG {
    // node class of the linked list
    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }


    static class Solution {

        static Node tempHead = null;
        static Node tempTail = null;

        public static void addFirst(Node node) {
            if (tempHead == null) {
                tempHead = node;
                tempTail = node;
            } else {
                node.next = tempHead;
                tempHead = node;
            }
        }

        public static int length(Node node) {
            Node current = node;
            int len = 0;
            while (current != null) {
                current = current.next;
                len++;
            }
            return len;
        }

        public static Node reverse(Node head, int k) {
            //Your code here
            if (head == null || head.next == null || k == 0) {
                return head;
            }

            Node originalHead = null, originalTail = null;
            int len = length(head);
            Node current = head;

            while (len >= k) {
                int tempK = k;

                while (tempK-- > 0) {
                    Node ahead = current.next;
                    current.next = null;
                    addFirst(current);
                    current = ahead;
                }

                if (originalHead == null) {
                    originalHead = tempHead;
                    originalTail = tempTail;
                } else {
                    originalTail.next = tempHead;
                    originalTail = tempTail;
                }

                tempHead = null;
                tempTail = null;
                len -= k;
            }
            Node temp = current, prev = null, next = null;
            while (temp != null) {
                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
            }
            originalTail.next = prev;
            return originalHead;
        }
    }
}
