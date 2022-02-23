/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 09:11 PM
 *   File: MinimumNumberOfSwaps2
 */

/**
 * LEETCODE QUESTION 1963 =>
 * <p>
 * You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and
 * n / 2 closing brackets ']'.
 * <p>
 * A string is called balanced if and only if:
 * <p>
 * It is the empty string, or
 * It can be written as AB, where both A and B are balanced strings, or
 * It can be written as [C], where C is a balanced string.
 * You may swap the brackets at any two indices any number of times.
 * <p>
 * Return the minimum number of swaps to make s balanced.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "][]["
 * Output: 1
 * Explanation: You can make the string balanced by swapping index 0 with index 3.
 * The resulting string is "[[]]".
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "]]][[["
 * Output: 2
 * Explanation: You can do the following to make the string balanced:
 * - Swap index 0 with index 4. s = "[]][][".
 * - Swap index 1 with index 5. s = "[[][]]".
 * The resulting string is "[[][]]".
 */

package final450DSA.strings;

import java.util.Stack;

public class MinimumNumberOfSwaps2 {
    static class Solution {
        public int minSwaps(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (ch == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(ch);
                        }
                    } else {
                        stack.push(ch);
                    }
                }
            }
            return (stack.size() / 4) + (stack.size() % 4 == 0 ? 0 : 1);
        }
    }
}
