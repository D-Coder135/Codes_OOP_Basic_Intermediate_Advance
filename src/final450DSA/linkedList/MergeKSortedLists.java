/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-04-2022/04/2022
 *   Time: 01:01 PM
 *   File: MergeKSortedLists
 */

/**
 * GFG & LEETCODE QUESTION 23 =>
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * Example 1:
 * <p>
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
 * <p>
 * Example 2:
 * <p>
 * Input: lists = []
 * Output: []
 * Example 3:
 * <p>
 * Input: lists = [[]]
 * Output: []
 */

package final450DSA.linkedList;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists.length == 0) {
                return null;
            }

            ArrayList<Integer> list = new ArrayList<>();

            for (ListNode listNode : lists) {
                ListNode curr = listNode;
                while (curr != null) {
                    list.add(curr.val);
                    curr = curr.next;
                }
            }

            Collections.sort(list);

            if (list.size() == 0) {
                return null;
            }

            ListNode head = new ListNode(list.get(0));
            ListNode curr = head;

            for (int i = 1; i < list.size(); i++) {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }

            return head;
        }
    }
}
