/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-02-2022/02/2022
 *   Time: 09:50 AM
 *   File: MinimumInsertionToMakePalindrome
 */

package final450DSA.strings;

public class MinimumInsertionToMakePalindrome {
    static class Solution {
        public int minInsertions(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int gap = 0; gap < s.length(); gap++) {
                for (int i = 0, j = gap; j < dp.length; i++, j++) {

                }
            }
        }
    }
}
