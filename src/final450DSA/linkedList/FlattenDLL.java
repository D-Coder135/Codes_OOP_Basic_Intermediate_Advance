/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-04-2022/04/2022
 *   Time: 02:09 PM
 *   File: FlattenDLL
 */

/**
 * LEETCODE QUESTION 430 =>
 * <p>
 * You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer,
 * and an additional child pointer. This child pointer may or may not point to a separate doubly linked list,
 * also containing these special nodes. These child lists may have one or more children of their own, and so on,
 * to produce a multilevel data structure as shown in the example below.
 * <p>
 * Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level,
 * doubly linked list. Let curr be a node with a child list. The nodes in the child list should appear after curr
 * and before curr.next in the flattened list.
 * <p>
 * Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
 * Output: [1,2,3,7,8,11,12,9,10,4,5,6]
 * Explanation: The multilevel linked list in the input is shown.
 * After flattening the multilevel linked list it becomes:
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,2,null,3]
 * Output: [1,3,2]
 * Explanation: The multilevel linked list in the input is shown.
 * After flattening the multilevel linked list it becomes:
 * <p>
 * Example 3:
 * <p>
 * Input: head = []
 * Output: []
 * Explanation: There could be empty list in the input.
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
                    curr = next;
                }

                if (curr != null) {
                    tail = curr;
                }
            }
            return tail;
        }

        public Node flatten(Node head) {
            if (head != null) {
                flattenRecursive(head);
            }

            return head;
        }
    }
}
