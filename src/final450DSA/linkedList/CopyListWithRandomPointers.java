/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 08-04-2022/04/2022
 *   Time: 02:44 PM
 *   File: CopyListWithRandomPointers
 */

package final450DSA.linkedList;

import java.util.HashMap;

public class CopyListWithRandomPointers {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    static class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node, Node> map = new HashMap<>();

        }
    }

}
