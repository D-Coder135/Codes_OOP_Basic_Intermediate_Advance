/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-04-2022/04/2022
 *   Time: 10:24 PM
 *   File: RotateList
 */

package final450DSA.linkedList;

public class RotateList {
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
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
                return head;
            }

            ListNode tail = head;
            int length = 1;

            while (tail.next != null) {
                tail = tail.next;
                length++;
            }

            tail.next = head;

            k = length - (k % length);

            while (k > 0) {
                tail = tail.next;
                k--;
            }

            head = tail.next;
            tail.next = null;

            return head;
        }
    }
}
