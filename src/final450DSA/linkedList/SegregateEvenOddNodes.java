/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 09:37 PM
 *   File: SegregateEvenOddNodes
 */

package final450DSA.linkedList;

public class SegregateEvenOddNodes {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Solution {
        Node divide(int N, Node head) {
            // code here
            Node even = new Node(-1);
            Node odd = new Node(-1);
            Node startingEvenNode = even;
            Node startingOddNode = odd;

            while (head != null) {
                if (head.data % 2 == 0) {
                    even.next = head;
                    even = even.next;
                } else {
                    odd.next = head;
                    odd = odd.next;
                }
                head = head.next;
            }
        }
    }
}
