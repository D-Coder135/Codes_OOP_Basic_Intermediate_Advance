/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09-04-2022/04/2022
 *   Time: 01:22 PM
 *   File: MultiplyNumberInTwoLL
 */

package final450DSA.linkedList;

public class MultiplyNumberInTwoLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class GfG {
        /*You are required to complete this method */
        public long multiplyTwoLists(Node l1, Node l2) {
            //add code here.
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();

            while (l1 != null) {
                str1.append(l1.data);
                l1 = l1.next;
            }

            while (l2 != null) {
                str2.append(l2.data);
                l2 = l2.next;
            }

            return ((Long.parseLong(str1.toString()) * Long.parseLong(str2.toString())) % 1000000007);
        }
    }
}
