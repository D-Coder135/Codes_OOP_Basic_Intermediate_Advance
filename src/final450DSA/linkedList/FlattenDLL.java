/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-04-2022/04/2022
 *   Time: 02:09 PM
 *   File: FlattenDLL
 */

package final450DSA.linkedList;

public class FlattenDLL {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    static class Solution {

        private Node flattenRecursive(Node headNode) {
            Node curr = headNode, tail = headNode;

            while (curr != null) {
                Node child = curr.child;
                Node next = curr.next;

                if (child != null) {
                    Node _tail = flattenRecursive(child);
                    _tail.next = next;

                    if (next != null) {
                        next.prev = _tail;
                    }

                    curr.next = child;
                    child.prev = curr;
                    curr.child = null;
                    curr = tail;
                } else {

                }
            }
        }

        public Node flatten(Node head) {

        }
    }
}
