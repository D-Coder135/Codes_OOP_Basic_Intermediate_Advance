/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-04-2022/04/2022
 *   Time: 11:24 AM
 *   File: FlatternALinkedList
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:
 * (i) a next pointer to the next node,
 * (ii) a bottom pointer to a linked list where this node is head.
 * Each of the sub-linked-list is in sorted order.
 * Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order.
 * Note: The flattened list will be printed using the bottom pointer instead of next pointer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5 -> 10 -> 19 -> 28
 * |     |     |     |
 * 7     20    22   35
 * |           |     |
 * 8          50    40
 * |                 |
 * 30               45
 * Output:  5-> 7-> 8- > 10 -> 19-> 20->
 * 22-> 28-> 30-> 35-> 40-> 45-> 50.
 * Explanation:
 * The resultant linked lists has every
 * node in a single level.
 * (Note: | represents the bottom pointer.)
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * 5 -> 10 -> 19 -> 28
 * |          |
 * 7          22
 * |          |
 * 8          50
 * |
 * 30
 * Output: 5->7->8->10->19->22->28->30->50
 * Explanation:
 * The resultant linked lists has every
 * node in a single level.
 * <p>
 * (Note: | represents the bottom pointer.)
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
            result.next = null;
            return result;
        }
    }
}
