/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 02:50 PM
 *   File: CycleInLinkedList
 */

package final450DSA.linkedList;

public class CycleInLinkedList {


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
        public boolean hasCycle(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {

            }
        }
    }


}
