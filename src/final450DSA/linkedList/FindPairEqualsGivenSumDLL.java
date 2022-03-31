/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 31-03-2022/03/2022
 *   Time: 09:43 AM
 *   File: FindPairEqualsGivenSumDLL
 */

package final450DSA.linkedList;

public class FindPairEqualsGivenSumDLL {
    static class Node {
        int data;
        Node next, prev;
    }

    static void pairSum(Node head, int sum) {
        if (head == null || head.next == null) {
            return;
        }

        Node first = head, second = head;

        while (second.next != null) {
            second = second.next;
        }

        boolean found = false;

        while (first != second || second.next != first) {
            if (first.data + second.data < sum) {

            }
        }
    }
}
