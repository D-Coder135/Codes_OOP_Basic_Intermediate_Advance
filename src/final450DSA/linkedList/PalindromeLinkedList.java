/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 01:07 PM
 *   File: PalindromeLinkedList
 */

/**
 * GFG & LEETCODE QUESTION 234 =>
 * <p>
 * Given the head of a singly linked list, return true if it is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,2,1]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2]
 * Output: false
 */

package final450DSA.linkedList;

public class PalindromeLinkedList {
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
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return false;
            }

            if (head.next == null) {
                return true;
            }

            StringBuilder str = new StringBuilder();

            while (head != null) {
                str.append(head.val);
                head = head.next;
            }

            return str.toString().equals(str.reverse().toString());
        }
    }
}
