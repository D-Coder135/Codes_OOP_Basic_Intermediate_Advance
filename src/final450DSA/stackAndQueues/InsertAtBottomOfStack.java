/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-04-2022/04/2022
 *   Time: 04:14 PM
 *   File: InsertAtBottomOfStack
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class InsertAtBottomOfStack {
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int x = stack.pop();
    }
}
