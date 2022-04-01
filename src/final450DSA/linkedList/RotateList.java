/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-04-2022/04/2022
 *   Time: 10:24 PM
 *   File: RotateList
 */

/**
 * LEETCODE QUESTION 61 =>
 * <p>
 * Given the head of a linked list, rotate the list to the right by k places.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [0,1,2], k = 4
 * Output: [2,0,1]
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
