/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-04-2022/04/2022
 *   Time: 09:56 PM
 *   File: RotateListDLLByPNodes
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer
 * and is smaller than the count of nodes(N) in a linked list.
 * <p>
 * Example 1:
 * <p>
 * Input: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6 , P = 2
 * Output: 3 <-> 4 <-> 5 <-> 6 <-> 1 <-> 2
 * Explanation: Doubly linked list after rotating
 * 2 nodes is: 3 4 5 6 1 2.
 * <p>
 * Example 2:
 * <p>
 * Input: 3 <-> 4 <-> 5 <-> 1 ,P = 3
 * Output: 1<-> 3 <-> 4 <-> 5
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
