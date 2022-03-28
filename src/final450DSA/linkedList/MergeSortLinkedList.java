/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-03-2022/03/2022
 *   Time: 07:50 PM
 *   File: MergeSortLinkedList
 */

package final450DSA.linkedList;

public class MergeSortLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int key) {
            this.data = key;
            next = null;
        }
    }

    static class Solution {
        //Function to sort the given linked list using Merge Sort.
        static Node mergeSort(Node head) {
            // add your code here
            if (head == null || head.next != null) {
                return head;
            }

            Node slow = head, fast = head;

            while (fast.next != null && fast.next.next != null) {

            }
        }
    }

}
