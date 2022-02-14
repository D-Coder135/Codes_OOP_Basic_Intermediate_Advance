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
    // Leetcode Solution
    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() <= 1) {
                return s;
            }

            String best = s.substring(0, 1);

            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length() - 1; j > i; j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        String result = checkPalindrome(s, i, j);

                        if (result == null) {
                            continue;
                        }
                        if (result.length() > best.length()) {
                            best = result;
                        }
                        break;
                    }
                }
            }
            return best;
        }

        private String checkPalindrome(String s, int start, int end) {
            for (int i = start, j = end; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return null;
                }
            }
            return s.substring(start, end + 1);
        }
    }

    // GFG Solution
    static class SolutionGFG {
        static String longestPalin(String S) {
            // code here
            int max = 0;
            String ans = "";
            for (int i = 0; i < S.length(); i++) {
                for (int j = i; j < S.length(); j++) {
                    String sub = S.substring(i, j + 1);
                    int len = checkPalin(sub);
                    if (len > max) {
                        max = len;
                        ans = sub;
                    }
                }
            }
            return ans;
        }

        static int checkPalin(String str) {
            int i = 0;
            int j = str.length() - 1;

            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return 0;
                }
                i++;
                j--;
            }
            return str.length();
        }
    }
}
