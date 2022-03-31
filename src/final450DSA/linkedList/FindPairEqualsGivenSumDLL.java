/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 31-03-2022/03/2022
 *   Time: 09:43 AM
 *   File: FindPairEqualsGivenSumDLL
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a sorted doubly linked list of positive distinct elements, the task is to find pairs in a doubly-linked list
 * whose sum is equal to given value x, without using any extra space?
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

        while (first != second && second.next != first) {
            if (first.data + second.data == sum) {
                found = true;
                System.out.println("(" + first.data + ", " + second.data + ")");
            } else if (first.data + second.data < sum) {
                first = first.next;
            } else {
                second = second.prev;
            }
        }

        if (!found) {
            System.out.println("No Pairs Found As Such!");
        }
    }
}
