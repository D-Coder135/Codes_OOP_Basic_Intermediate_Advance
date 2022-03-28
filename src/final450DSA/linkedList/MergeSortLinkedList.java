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

        static Node merge(Node left, Node right) {
            if (left == null && right == null) {
                return null;
            } else if (left == null) {
                return right;
            } else if (right == null) {
                return left;
            }

            Node leftNode = left, rightNode = right, head = null;

            if (leftNode.data <= rightNode.data) {
                head = leftNode;
                leftNode = leftNode.next;
            } else if (leftNode.data > rightNode.data) {
                head = rightNode;
                rightNode = rightNode.next;
            }

            Node temp = head;
        }

        //Function to sort the given linked list using Merge Sort.
        static Node mergeSort(Node head) {
            // add your code here
            if (head == null || head.next != null) {
                return head;
            }

            Node slow = head, fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node left = head, mid = slow, right = mid.next, res;

            mid.next = null;

            left = mergeSort(left);
            right = mergeSort(right);
            res = merge(left, right);

            return res;

        }
    }

}
