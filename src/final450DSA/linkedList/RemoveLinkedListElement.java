/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 10-04-2022/04/2022
 *   Time: 11:45 PM
 *   File: RemoveLinkedListElement
 */

/**
 * LEETCODE QUESTION 203 =>
 * <p>
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list
 * that has Node.val == val, and return the new head.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: head = [], val = 1
 * Output: []
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 */

package final450DSA.linkedList;

public class RemoveLinkedListElement {
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
        public ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val == val) {
                head = head.next;
            }

            ListNode curr = head;

            while (curr != null && curr.next != null) {
                if (curr.next.val == val) {
                    curr.next = curr.next.next;
                } else {
                    curr = curr.next;
                }
            }

            return head;
        }
    }
}
