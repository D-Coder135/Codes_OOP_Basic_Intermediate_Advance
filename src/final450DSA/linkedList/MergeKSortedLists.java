/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-04-2022/04/2022
 *   Time: 01:01 PM
 *   File: MergeKSortedLists
 */

package final450DSA.linkedList;

import java.util.ArrayList;

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

            for (int i = 0; i < lists.length; i++) {
                ListNode curr = lists[i];
            }
        }
    }
}
