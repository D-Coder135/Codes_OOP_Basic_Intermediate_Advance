/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-03-2022/03/2022
 *   Time: 03:14 PM
 *   File: RemoveDuplicateElementsUnsorted
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
        }
    }
}
