/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-04-2022/04/2022
 *   Time: 09:56 PM
 *   File: RotateListDLLByPNodes
 */

package final450DSA.linkedList;

public class RotateListDLLByPNodes {
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static class Solution {
        public Node update(Node start, int p) {
            //Write your code here
            Node curr = start;

            for (int i = 0; i < p - 1; i++) {
                curr = curr.next;
            }

            Node newHead = curr.next;
            newHead.prev = null;
            curr.next = null;

            curr = newHead;

            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = start;
            start.prev = curr;

            return newHead;
        }
    }
}
