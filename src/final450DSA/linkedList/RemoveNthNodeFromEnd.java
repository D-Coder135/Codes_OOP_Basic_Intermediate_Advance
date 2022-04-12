/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 10:42 PM
 *   File: RemoveNthNode
 */

/**
 * LEETCODE QUESTION 19 =>
 * <p>
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1], n = 1
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1,2], n = 1
 * Output: [1]
 */

package final450DSA.linkedList;

public class RemoveNthNodeFromEnd {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head.next == null) {
                return null;
            }
            ListNode curr = head;
            int counter = 0;

            while (counter < n && curr != null) {
                curr = curr.next;
                counter++;
            }

            if (curr == null) {
                return head.next;
            }

            ListNode slow = head, prev = null;

            while (curr != null) {
                curr = curr.next;

                prev = slow;
                slow = slow.next;
            }
            prev.next = slow.next;

            return head;
        }
    }

}
