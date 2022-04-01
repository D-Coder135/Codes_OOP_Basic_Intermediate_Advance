/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-04-2022/04/2022
 *   Time: 09:51 PM
 *   File: SortKSortedDLL
 */

package final450DSA.linkedList;

import java.util.Comparator;

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

    }
}
