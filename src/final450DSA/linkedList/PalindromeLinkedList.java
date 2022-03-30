/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-03-2022/03/2022
 *   Time: 01:07 PM
 *   File: PalindromeLinkedList
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
        }
    }
}
