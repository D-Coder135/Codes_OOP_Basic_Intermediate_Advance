/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-03-2022/03/2022
 *   Time: 03:14 PM
 *   File: RemoveDuplicateElementsUnsorted
 */

/**
 * GFG & LEETCODE QUESTION (PREMIUM) =>
 * <p>
 * Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this unsorted Linked List.
 * When a value appears in multiple nodes, the node which appeared first should be kept,
 * all others duplicates are to be removed.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * value[] = {5,2,2,4}
 * Output: 5 2 4
 * Explanation:Given linked list elements are
 * 5->2->2->4, in which 2 is repeated only.
 * So, we will delete the extra repeated
 * elements 2 from the linked list and the
 * resultant linked list will contain 5->2->4
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * value[] = {2,2,2,2,2}
 * Output: 2
 * Explanation:Given linked list elements are
 * 2->2->2->2->2, in which 2 is repeated. So,
 * we will delete the extra repeated elements
 * 2 from the linked list and the resultant
 * linked list will contain only 2.
 */

package final450DSA.linkedList;

import java.util.HashSet;

public class RemoveDuplicateElementsUnsorted {
    // The structure of linked list is the following
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {
        //Function to remove duplicates from unsorted linked list.
        public Node removeDuplicates(Node head) {
            // Your code here
            if (head == null || head.next == null) {
                return head;
            }

            HashSet<Integer> set = new HashSet<>();
            Node current = head;
            Node prev = null;

            while (current != null) {
                if (set.contains(current.data)) {
                    prev.next = current.next;
                } else {
                    set.add(current.data);
                    prev = current;
                }
                current = current.next;
            }
            return head;
        }
    }
}
