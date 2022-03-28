/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 28-03-2022/03/2022
 *   Time: 07:50 PM
 *   File: MergeSortLinkedList
 */

/**
 * GFG & LEETCODE QUESTION 148 =>
 * <p>
 * Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list using Merge Sort.
 * Note: If the length of linked list is odd, then the extra node should go in the first list while splitting.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * value[]  = {3,5,2,4,1}
 * Output: 1 2 3 4 5
 * Explanation: After sorting the given
 * linked list, the resultant matrix
 * will be 1->2->3->4->5.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 3
 * value[]  = {9,15,0}
 * Output: 0 9 15
 * Explanation: After sorting the given
 * linked list , resultant will be
 * 0->9->15.
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

            while (leftNode != null && rightNode != null) {
                if (leftNode.data <= rightNode.data) {
                    temp.next = leftNode;
                    leftNode = leftNode.next;
                    temp = temp.next;
                } else if (leftNode.data > rightNode.data) {
                    temp.next = rightNode;
                    rightNode = rightNode.next;
                    temp = temp.next;
                }
            }
            if (leftNode == null) {
                temp.next = rightNode;
            } else if (rightNode == null) {
                temp.next = leftNode;
            }
            return head;
        }

        //Function to sort the given linked list using Merge Sort.
        static Node mergeSort(Node head) {
            // add your code here
            if (head == null || head.next == null) {
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
