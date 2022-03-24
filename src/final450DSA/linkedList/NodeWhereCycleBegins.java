/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 03:19 PM
 *   File: NodeWhereCycleBegins
 */

package final450DSA.linkedList;

public class NodeWhereCycleBegins {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode current = head;
            ListNode slow = head, fast = head;
            ListNode temp = null;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    temp = slow;
                }
            }
        }
    }
}
