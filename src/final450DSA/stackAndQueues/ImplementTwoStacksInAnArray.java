/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-04-2022/04/2022
 *   Time: 11:44 AM
 *   File: ImplementTwoStacksInAnArray
 */

package final450DSA.stackAndQueues;

public class ImplementTwoStacksInAnArray {
    static class TwoStack {

        int size;
        int top1, top2;
        int[] arr = new int[100];

        TwoStack() {
            size = 100;
            top1 = -1;
            top2 = size;
        }
    }
}
