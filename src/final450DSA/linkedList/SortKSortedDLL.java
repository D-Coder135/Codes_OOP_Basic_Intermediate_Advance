/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-04-2022/04/2022
 *   Time: 09:51 PM
 *   File: SortKSortedDLL
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a doubly linked list containing n nodes, where each node is at most k away from its target position in the
 * list. The problem is to sort the given doubly linked list. For example, let us consider k is 2, a node at
 * position 7 in the sorted doubly linked list, can be at positions 5, 6, 7, 8, 9 in the given doubly linked list.
 */

package final450DSA.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortKSortedDLL {
    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    static class CompareNodes implements Comparator<Node> {

        @Override
        public int compare(Node node1, Node node2) {
            return node1.data - node2.data;
        }
    }

    static Node sortKSortedDLL(Node head, int k) {
        if (head == null) {
            return head;
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new CompareNodes());
        Node newHead = null, last = null;

        for (int i = 0; head != null && i <= k; i++) {
            priorityQueue.add(head);
            head = head.next;
        }

        while (!priorityQueue.isEmpty()) {
            if (newHead == null) {
                newHead = priorityQueue.peek();
                newHead.prev = null;
                last = newHead;
            } else {
                last.next = priorityQueue.peek();
                priorityQueue.peek().prev = last;
                last = priorityQueue.peek();
            }

            priorityQueue.poll();

            if (head != null) {
                priorityQueue.add(head);
                head = head.next;
            }
        }

        last.next = null;

        return newHead;
    }
}
