/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-04-2022/04/2022
 *   Time: 11:24 AM
 *   File: FlatternALinkedList
 */

package final450DSA.linkedList;

public class FlatternALinkedList {
    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    static class GfG {
        Node flatten(Node root) {
            // Your code here
            if (root == null || root.next == null) {
                return root;
            }

            return merge(root, flatten(root.next));
        }

        private Node merge(Node firstNode, Node secondNode) {
            if (firstNode == null) {
                return secondNode;
            }

            if (secondNode == null) {
                return firstNode;
            }

            Node result = null;

            if (firstNode.data < secondNode.data) {
                result = firstNode;
                result.bottom = merge(firstNode.bottom, secondNode);
            } else {
                result = secondNode;
                result.bottom = merge(firstNode, secondNode.bottom);
            }

            return null;
        }
    }
}
