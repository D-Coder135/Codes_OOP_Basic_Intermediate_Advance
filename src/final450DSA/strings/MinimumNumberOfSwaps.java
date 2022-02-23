/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-02-2022/02/2022
 *   Time: 08:41 PM
 *   File: MinimumNumberOfSwaps
 */

/**
 * GFG QUESTION =>
 * <p>
 * You are given a string S of 2N characters consisting of N ‘[‘ brackets and N ‘]’ brackets. A string is considered
 * balanced if it can be represented in the for S2[S1] where S1 and S2 are balanced strings. We can make an unbalanced
 * string balanced by swapping adjacent characters. Calculate the minimum number of swaps necessary to make a
 * string balanced.
 * Note - Strings S1 and S2 can be empty.
 * <p>
 * Example 1:
 * <p>
 * Input  : []][][
 * Output : 2
 * Explanation :
 * First swap: Position 3 and 4
 * [][]][
 * Second swap: Position 5 and 6
 * [][][]
 * <p>
 * Example 2:
 * <p>
 * Input : [[][]]
 * Output : 0
 * Explanation:
 * String is already balanced.
 */

package final450DSA.strings;

public class MinimumNumberOfSwaps {
    static class Solution {
        static int minimumNumberOfSwaps(String S) {
            int open = 0, close = 0, fault = 0, swap = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == ']') {
                    close++;
                    fault = close - open;
                } else {
                    open++;
                    if (fault > 0) {
                        swap += fault;
                        fault--;
                    }
                }
            }
            return swap;
        }
    }
}
