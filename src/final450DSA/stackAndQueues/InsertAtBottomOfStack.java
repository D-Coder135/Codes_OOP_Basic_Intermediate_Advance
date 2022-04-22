/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-04-2022/04/2022
 *   Time: 04:14 PM
 *   File: InsertAtBottomOfStack
 */

/**
 * WAP to insert an element at the bottom of the stack.
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
        insertAtBottom(stack, item);
        stack.push(x);
    }
}
