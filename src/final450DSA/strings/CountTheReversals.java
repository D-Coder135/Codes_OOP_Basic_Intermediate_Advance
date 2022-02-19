/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-02-2022/02/2022
 *   Time: 08:46 PM
 *   File: CountTheReversals
 */


package final450DSA.strings;

import java.util.Stack;

public class CountTheReversals {
    static class Sol {
        int countRev(String s) {
            // your code here
            if (s.length() == 0 || s.length() % 2 != 0) {
                return -1;
            } else {
                Stack<Character> stack = new Stack<>();
                int openingCount = 0;
                int closingCount = 0;
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == '{') {
                        stack.push(ch);
                        openingCount++;
                    } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        openingCount--;
                    } else {
                        closingCount++;
                    }
                }
                if (closingCount % 2 != 0) {
                    closingCount = (closingCount / 2) + 1;
                } else {
                    closingCount = closingCount / 2;
                }
            }
        }
    }
}
