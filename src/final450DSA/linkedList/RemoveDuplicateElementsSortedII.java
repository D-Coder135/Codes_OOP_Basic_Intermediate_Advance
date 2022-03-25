/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-03-2022/03/2022
 *   Time: 03:45 PM
 *   File: RemoveDuplicateElementsSortedII
 */

package final450DSA.linkedList;

public class RemoveDuplicateElementsSortedII {
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
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode dummy = new ListNode(0, head);
            ListNode prev = dummy;

            while (head != null) {
                if (head.next != null && head.val == head.next.val) {
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }
                    prev.next = head.next;
                } else {
                    prev = prev.next;
                }
            }

        }
    }
}
