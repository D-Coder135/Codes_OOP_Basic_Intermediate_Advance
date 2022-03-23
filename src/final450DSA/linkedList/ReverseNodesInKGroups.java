/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-03-2022/03/2022
 *   Time: 11:29 PM
 *   File: ReverseNodesInKGroups
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
        }
    }

}
