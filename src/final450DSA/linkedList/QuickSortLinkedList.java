/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-03-2022/03/2022
 *   Time: 11:26 PM
 *   File: QuickSortLinkedList
 */

package final450DSA.linkedList;

public class QuickSortLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    static class GfG {

        public static Node partition(Node node) {
            Node ahead = node.next;
            Node temp1 = node;
            Node my = node;
            Node prev = temp1;

            while (ahead != null) {
                if (ahead.data <= my.data) {
                    prev = temp1;
                    temp1 = temp1.next;
                    int data = ahead.data;
                    ahead.data = temp1.data;
                    temp1.data = data;
                }
            }
        }

        public static Node quickSort(Node node) {
            //Your code here
        }


    }
}
