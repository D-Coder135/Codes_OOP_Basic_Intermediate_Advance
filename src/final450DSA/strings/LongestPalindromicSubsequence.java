/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 10:26 AM
 *   File: LongestPalindromicSubsequence
 */

package final450DSA.strings;

public class LongestPalindromicSubsequence {
    static class Solution {
        public int longestPalindromeSubseq(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int gap = 0; gap < s.length(); gap++) {
                for (int i = 0, j = gap; j < dp.length; i++, j++) {
                    if (gap == 0) {

                    }
                }
            }
        }
    }
}
