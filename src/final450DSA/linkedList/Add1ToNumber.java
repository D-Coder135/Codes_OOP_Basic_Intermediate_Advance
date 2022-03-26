/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-03-2022/03/2022
 *   Time: 10:55 AM
 *   File: Add1ToNumber
 */

/**
 * GFG QUESTION =>
 * <p>
 * A number N is represented in Linked List such that each digit corresponds to a node in linked list.
 * You need to add 1 to it.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList: 4->5->6
 * Output: 457
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * LinkedList: 1->2->3
 * Output: 124
 */

package final450DSA.linkedList;

import java.math.BigInteger;

public class Add1ToNumber {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static class Solution {
        public static Node addOne(Node head) {
            //code here.
            Node temp = head;
            StringBuilder str = new StringBuilder();

            while (temp != null) {
                str.append(temp.data);
                temp = temp.next;
            }

            BigInteger num = new BigInteger(str.toString());
            BigInteger one = new BigInteger("1");
            BigInteger res = num.add(one);
            System.out.println(res);

            return null;
        }
    }
}
