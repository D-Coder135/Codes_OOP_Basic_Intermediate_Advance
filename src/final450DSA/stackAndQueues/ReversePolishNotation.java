/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-04-2022/04/2022
 *   Time: 06:45 PM
 *   File: ReversePolishNotation
 */

/**
 * LEETCODE QUESTION 150 =>
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate
 * to a result, and there will not be any division by zero operation.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * <p>
 * Example 2:
 * <p>
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * <p>
 * Example 3:
 * <p>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
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
                        value = y - x;
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
