/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 09:27 PM
 *   File: MinimumSwapsStringEqual
 */

/**
 * LEETCODE QUESTION 1247 =>
 * <p>
 * You are given two strings s1 and s2 of equal length consisting of letters "x" and "y" only. Your task is to make
 * these two strings equal to each other. You can swap any two characters that belong to different strings,
 * which means: swap s1[i] and s2[j].
 * <p>
 * Return the minimum number of swaps required to make s1 and s2 equal, or return -1 if it is impossible to do so.
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "xx", s2 = "yy"
 * Output: 1
 * Explanation: Swap s1[0] and s2[1], s1 = "yx", s2 = "yx".
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s1 = "xy", s2 = "yx"
 * Output: 2
 * Explanation: Swap s1[0] and s2[0], s1 = "yy", s2 = "xx".
 * Swap s1[0] and s2[1], s1 = "xy", s2 = "xy".
 * Note that you cannot swap s1[0] and s1[1] to make s1 equal to "yx", cause we can only swap chars in different strings.
 */

package final450DSA.strings;

public class MinimumSwapsStringEqual {
    static class Solution {
        public int minimumSwap(String s1, String s2) {
            int numberOfX = 0, numberOfY = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (s1.charAt(i) == 'x') numberOfX++;
                    else numberOfY++;
                }
            }
            if (numberOfX % 2 == 0 && numberOfY % 2 == 0) {
                return (numberOfX + numberOfY) / 2;
            } else if (numberOfX % 2 == 1 && numberOfY % 2 == 1) {
                return ((numberOfX + numberOfY) / 2) + 1;
            } else {
                return -1;
            }
        }
    }
}
