/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-02-2022/02/2022
 *   Time: 06:36 PM
 *   File: ReverseString
 */

/**
 * LEETCODE QUESTION 344 =>
 * <p>
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * <p>
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */

package final450DSA.strings;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        char[] result = swapElements(s, start, end);
        System.out.println(Arrays.toString(result));
    }

    private char[] swapElements(char[] s, int start, int end) {
        if (start > end) {
            return s;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        return swapElements(s, start + 1, end - 1);
    }
}
