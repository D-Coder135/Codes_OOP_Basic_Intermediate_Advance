/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-03-2022/03/2022
 *   Time: 01:40 PM
 *   File: IntersectionOfTwoLinkedList__LEETCODE
 */

package final450DSA.linkedList;

public class IntersectionOfTwoLinkedList__LEETCODE {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode temp1 = headA, temp2 = headB;

            while (temp1 != temp2) {
                if (temp1 == null) {
                    temp1 = headB;
                } else {
                    temp1 = temp1.next;
                }

                if (temp2 == null) {
                    temp2 = headA;
                } else {
                    temp2 = temp2.next;
                }
            }

            return temp1;
        }
    }
}
