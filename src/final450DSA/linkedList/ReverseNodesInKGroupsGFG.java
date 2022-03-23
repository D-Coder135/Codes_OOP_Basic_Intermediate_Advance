/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 12:05 AM
 *   File: ReverseNodesInKGroupsGFG
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) in
 * the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end,
 * should be considered as a group and must be reversed (See Example 2 for clarification).
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 1->2->2->4->5->6->7->8
 * K = 4
 * Output: 4 2 2 1 8 7 6 5
 * Explanation:
 * The first 4 elements 1,2,2,4 are reversed first
 * and then the next 4 elements 5,6,7,8. Hence, the
 * resultant linked list is 4->2->2->1->8->7->6->5.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 1->2->3->4->5
 * K = 3
 * Output: 3 2 1 5 4
 * Explanation:
 * The first 3 elements are 1,2,3 are reversed
 * first and then elements 4,5 are reversed.Hence,
 * the resultant linked list is 3->2->1->5->4.
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
