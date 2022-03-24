/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-03-2022/03/2022
 *   Time: 03:45 PM
 *   File: RemoveCycle
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
                }
            }
        }
    }
}
