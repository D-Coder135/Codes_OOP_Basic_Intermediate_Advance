/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 06:26 PM
 *   File: ReverseString
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ReverseString {
    static class Solution {
        public void reverseString(char[] s) {
            Stack<Character> stack = new Stack<>();
            for (char character : s) {
                stack.push(character);
            }
        }
    }
}
