/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 14-02-2022/02/2022
 *   Time: 11:17 PM
 *   File: LongestPalindromeSubstring
 */

/**
 * LEETCODE QUESTION 5 =>
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 */


package final450DSA.strings;

public class LongestPalindromeSubstring {
    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() <= 1) {
                return s;
            }

            String best = s.substring(0, 1);

            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length() - 1; j > i; j--) {

                }
            }
        }
    }
}
