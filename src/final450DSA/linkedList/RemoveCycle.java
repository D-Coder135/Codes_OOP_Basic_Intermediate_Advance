/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 03:45 PM
 *   File: RemoveCycle
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a linked list of N nodes such that it may contain a loop.
 * <p>
 * A loop here means that the last node of the link list is connected to the node at position X. If the
 * link list does not have any loop, X=0.
 * <p>
 * Remove the loop from the linked list, if it is present.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * value[] = {1,8,3,4}
 * X = 0
 * Output: 1
 * Explanation: The Linked list does not
 * contain any loop.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * value[] = {1,2,3,4}
 * X = 1
 * Output: 1
 */

package final450DSA.linkedList;

public class RemoveCycle {

    static class Node {
        int data;
        Node next;
    }

    static class Solution {
        //Function to remove a loop in the linked list.
        public static void removeLoop(Node head) {
            // code here
            // remove the loop without losing any nodes

            Node dummy = new Node();
            dummy.next = head;
            Node fast = dummy, slow = dummy, temp = dummy;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow) {
                    while (slow.next != temp.next) {
                        slow = slow.next;
                        temp = temp.next;
                    }
                    slow.next = null;
                    break;
                }
            }
        }
    }
}
