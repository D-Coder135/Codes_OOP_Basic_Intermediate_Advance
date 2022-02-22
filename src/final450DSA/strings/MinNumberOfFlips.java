/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 04:18 PM
 *   File: MinNumberOfFlips
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a binary string, that is it contains only 0s and 1s. We need to make this string a sequence of alternate
 * characters by flipping some bits, our goal is to minimize the number of bits to be flipped.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "001"
 * Output: 1
 * Explanation:
 * We can flip the 0th bit to 1 to have
 * 101.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * S = "0001010111"
 * Output: 2
 * Explanation: We can flip the 1st and 8th bit
 * bit to have "0101010101"
 * 101.
 */

package final450DSA.strings;

public class MinNumberOfFlips {
    static class Solution {
        public int minFlips(String S) {
            int first = 0, second = 0;

            for (int i = 0; i < S.length(); i++) {
                if ((i % 2 == 0 && S.charAt(i) == '1') || (i % 2 != 0 && S.charAt(i) == '0')) {
                    first++;
                } else {
                    second++;
                }
            }
            return Math.min(first, second);
        }
    }
}
