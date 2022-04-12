/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 09:48 PM
 *   File: OddEvenList
 */

/**
 * LEETCODE QUESTION 328 =>
 * <p>
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes
 * with even indices, and return the reordered list.
 * <p>
 * The first node is considered odd, and the second node is even, and so on.
 * <p>
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * <p>
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5]
 * Output: [1,3,5,2,4]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [2,1,3,5,6,4,7]
 * Output: [2,3,6,7,1,5,4]
 */

package final450DSA.linkedList;

public class OddEvenList {
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null) {
                return head;
            }

            ListNode odd = head;
            ListNode even = head.next;
            ListNode ans = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = ans;

            return head;
        }
    }
}
