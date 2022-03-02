/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 12:22 AM
 *   File: NumberOf1Bits
 */

/**
 * LEETCODE QUESTION 191 =>
 * <p>
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has
 * (also known as the Hamming weight).
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be
 * given as a signed integer type. It should not affect your implementation, as the integer's internal
 * binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 3, the input represents the signed integer. -3.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 00000000000000000000000000001011
 * Output: 3
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: n = 00000000000000000000000010000000
 * Output: 1
 * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: n = 11111111111111111111111111111101
 * Output: 31
 * Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
 */

package leetCodes;

public class NumberOf1Bits {
    public static class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int counter = 0;
            while (n != 0) {
                n = n & (n - 1);
                counter++;
            }

            return counter;
        }
    }

    /*
    * ANOTHER APPROACH
    *
    * public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int counter = 0, mask = 1;
        for(int i = 0; i < 32; i++) {
            if((n & mask) != 0) counter++;
            mask = mask << 1;
        }
        return counter;
    }
}
    * */
}
