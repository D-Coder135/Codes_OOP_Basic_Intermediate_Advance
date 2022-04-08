/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 08-04-2022/04/2022
 *   Time: 02:44 PM
 *   File: CopyListWithRandomPointers
 */

package final450DSA.linkedList;

import java.util.HashMap;

public class CopyListWithRandomPointers {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node, Node> map = new HashMap<>();
            Node curr = head;
            Node newHead = new Node(-1);
            Node prev = newHead;

            while (curr != null) {
                Node newNode = new Node(curr.val);
                prev.next = newNode;

                map.put(curr, newNode);
                prev = prev.next;
                curr = curr.next;
            }

            newHead = newHead.next;
            Node temp1 = head;
            Node temp2 = newHead;

            while (temp1 != null) {
                temp2.random = temp1.random != null ? map.get(temp1.random) : null;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }


        }
    }

}
