/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 29-03-2022/03/2022
 *   Time: 01:47 PM
 *   File: MiddleOfLinkedList
 */

package final450DSA.linkedList;

public class MiddleNodeLinkedList {
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
        public ListNode middleNode(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode slow = head, fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
    }
}
