/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 27-03-2022/03/2022
 *   Time: 01:40 PM
 *   File: IntersectionOfTwoLinkedList__LEETCODE
 */

/**
 * LEETCODE QUESTION 160 =>
 * <p>
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 * <p>
 * Example 1:
 * <p>
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Intersected at '8'
 * Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes
 * before the intersected node in A; There are 3 nodes before the intersected node in B.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Intersected at '2'
 * Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
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
