/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-04-2022/04/2022
 *   Time: 04:41 PM
 *   File: SortAStack
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class SortAStack {
    static class GfG {
        public Stack<Integer> sort(Stack<Integer> s) {
            //add code here.
            if (s.isEmpty()) {
                return s;
            }
            int item = s.pop();
            sort(s);
        }
    }
}
