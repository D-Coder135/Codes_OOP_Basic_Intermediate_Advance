/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 12:22 AM
 *   File: NumberOf1Bits
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
