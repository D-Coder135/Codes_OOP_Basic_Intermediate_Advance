/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 11:33 AM
 *   File: AddTwoNumber_GFG
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given two numbers represented by two linked lists of size N and M. The task is to return a sum list.
 * <p>
 * The sum list is a linked list representation of the addition of two input numbers from the last.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 2
 * valueN[] = {4,5}
 * M = 3
 * valueM[] = {3,4,5}
 * Output: 3 9 0
 * Explanation: For the given two linked
 * list (4 5) and (3 4 5), after adding
 * the two linked list resultant linked
 * list will be (3 9 0).
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * valueN[] = {6,3}
 * M = 1
 * valueM[] = {7}
 * Output: 7 0
 * Explanation: For the given two linked
 * list (6 3) and (7), after adding the
 * two linked list resultant linked list
 * will be (7 0).
 */

package final450DSA.linkedList;

public class AddTwoNumber_GFG {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {

        static Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            node = prev;
            return node;
        }

        //Function to add two numbers represented by linked list.
        static Node addTwoLists(Node first, Node second) {
            // code here
            // return head of sum list
            Node temp = new Node(0);
            Node ans = temp;
            int carry = 0;

            Node l1 = reverse(first);
            Node l2 = reverse(second);

            while (l1 != null || l2 != null) {
                int sum = 0;
                if (l1 != null) {
                    sum += l1.data;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.data;
                    l2 = l2.next;
                }

                sum += carry;

                temp.next = new Node(sum % 10);
                carry = sum / 10;
                temp = temp.next;
            }
            if (carry != 0) {
                temp.next = new Node(carry);
            }
            return reverse(ans.next);
        }
    }
}
