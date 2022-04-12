/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 12-04-2022/04/2022
 *   Time: 09:37 PM
 *   File: SegregateEvenOddNodes
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a link list of size N, modify the list such that all the even numbers appear before all the odd numbers
 * in the modified list. The order of appearance of numbers within each segregation should be same as
 * that in the original list.
 * <p>
 * NOTE: Don't create a new linked list, instead rearrange the provided one.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 7
 * Link List:
 * 17 -> 15 -> 8 -> 9 -> 2 -> 4 -> 6 -> NULL
 * <p>
 * Output: 8 2 4 6 17 15 9
 * <p>
 * Explanation: 8,2,4,6 are the even numbers,
 * so they appear first and 17,15,9 are odd
 * numbers that appear later.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 4
 * Link List:
 * 1 -> 3 -> 5 -> 7
 * <p>
 * Output: 1 3 5 7
 * <p>
 * Explanation: There is no even number.
 * So né need for modification.
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

            even.next = startingOddNode.next;
            odd.next = null;

            return startingEvenNode.next;
        }
    }
}
