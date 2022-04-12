/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 10:42 PM
 *   File: RemoveNthNode
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
