/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 10-04-2022/04/2022
 *   Time: 11:32 PM
 *   File: DeleteNodesHavingGreaterValueOnRight
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
        }
    }
}
