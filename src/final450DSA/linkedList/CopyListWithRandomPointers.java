/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 08-04-2022/04/2022
 *   Time: 02:44 PM
 *   File: CopyListWithRandomPointers
 */

/**
 * GFG AND LEETCODE QUESTION 138 =>
 * <p>
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to
 * any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand-new nodes, where each new node
 * has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes
 * should point to new nodes in the copied list such that the pointers in the original list and copied list represent
 * the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y,
 * then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 * <p>
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented
 * as a pair of [val, random_index] where:
 * <p>
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it
 * does not point to any node.
 * Your code will only be given the head of the original linked list.
 * <p>
 * Example 1:
 * <p>
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * <p>
 * Example 2:
 * <p>
 * Input: head = [[1,1],[2,1]]
 * Output: [[1,1],[2,1]]
 * <p>
 * Example 3:
 * <p>
 * Input: head = [[3,null],[3,0],[3,null]]
 * Output: [[3,null],[3,0],[3,null]]
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

            return newHead;
        }
    }

}
