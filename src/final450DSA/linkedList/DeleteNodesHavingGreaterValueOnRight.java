/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 10-04-2022/04/2022
 *   Time: 11:32 PM
 *   File: DeleteNodesHavingGreaterValueOnRight
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a singly linked list, remove all the nodes which have a greater value on their right side.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * LinkedList = 12->15->10->11->5->6->2->3
 * Output: 15 11 6 3
 * Explanation: Since, 12, 10, 5 and 2 are
 * the elements which have greater elements
 * on the following nodes. So, after deleting
 * them, the linked list would like be 15,
 * 11, 6, 3.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * LinkedList = 10->20->30->40->50->60
 * Output: 60
 */

package final450DSA.linkedList;

public class DeleteNodesHavingGreaterValueOnRight {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class Solution {
        Node compute(Node head) {
            // your code here
            Node curr = head;
            Node prev = null;

            while (curr != null) {
                Node temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            int max = prev.data;
            Node res = new Node(-1);
            Node ans = res;
            Node tempNode = prev;

            while (tempNode != null) {
                if (tempNode.data >= max) {
                    res.next = new Node(tempNode.data);
                    res = res.next;
                    max = tempNode.data;
                }
                tempNode = tempNode.next;
            }

            Node curr1 = ans.next;
            Node prev1 = null;

            while (curr1 != null) {
                Node temp1 = curr1.next;
                curr1.next = prev1;
                prev1 = curr1;
                curr1 = temp1;
            }
            return prev1;
        }
    }
}
