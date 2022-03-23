/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-03-2022/03/2022
 *   Time: 11:29 PM
 *   File: ReverseNodesInKGroups
 */

/**
 * LEETCODE QUESTION 25 =>
 * <p>
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * <p>
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is
 * not a multiple of k then left-out nodes, in the end, should remain as it is.
 * <p>
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 */

package final450DSA.linkedList;

public class ReverseNodesInKGroups {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        static ListNode tempHead = null;
        static ListNode tempTail = null;

        public static void addFirst(ListNode node) {
            if (tempHead == null) {
                tempHead = node;
                tempTail = node;
            } else {
                node.next = tempHead;
                tempHead = node;
            }
        }

        public static int length(ListNode node) {
            ListNode current = node;
            int len = 0;
            while (current != null) {
                current = current.next;
                len++;
            }
            return len;
        }

        public ListNode reverseKGroups(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
                return head;
            }

            ListNode originalHead = null, originalTail = null;
            int len = length(head);
            ListNode current = head;

            while (len >= k) {
                int tempK = k;

                while (tempK-- > 0) {
                    ListNode ahead = current.next;
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
            originalTail.next = current;
            return originalHead;
        }
    }

}
