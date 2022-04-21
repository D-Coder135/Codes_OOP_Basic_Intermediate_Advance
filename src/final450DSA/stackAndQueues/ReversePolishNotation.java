/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-04-2022/04/2022
 *   Time: 06:45 PM
 *   File: ReversePolishNotation
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class ReversePolishNotation {
    static class Solution {
        public int evalRPN(String[] str) {
            Stack<String> stack = new Stack<>();
            int x, y;
            int value;

            String result;
            String choice;
            String p = "";

            for (String character : str) {
                if (!character.equals("+") && !character.equals("-") && !character.equals("*") && !character.equals("/")) {
                    stack.push(character);
                    continue;
                } else {
                    choice = character;
                }

                switch (choice) {
                    case "+" -> {
                        x = Integer.parseInt(String.valueOf(stack.pop()));
                        y = Integer.parseInt(String.valueOf(stack.pop()));
                        value = x + y;
                        result = p + value;
                        stack.push(result);
                    }
                    case "-" -> {
                        x = Integer.parseInt(String.valueOf(stack.pop()));
                        y = Integer.parseInt(String.valueOf(stack.pop()));
                        value = x - y;
                        result = p + value;
                        stack.push(result);
                    }
                    case "*" -> {
                        x = Integer.parseInt(String.valueOf(stack.pop()));
                        y = Integer.parseInt(String.valueOf(stack.pop()));
                        value = x * y;
                        result = p + value;
                        stack.push(result);
                    }
                    case "/" -> {
                        x = Integer.parseInt(stack.pop());
                        y = Integer.parseInt(stack.pop());
                        value = y / x;
                        result = p + value;
                        stack.push(result);
                    }
                    default -> {

                    }
                }
            }
            return Integer.parseInt(stack.pop());
        }
    }
}
