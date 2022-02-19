/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-02-2022/02/2022
 *   Time: 11:07 AM
 *   File: LongestPrefixSufixKMPAlgo
 */

/**
 * GFG & LEETCODE QUESTION 1392 =>
 * <p>
 * A string is called a happy prefix if is a non-empty prefix which is also a suffix (excluding itself).
 * <p>
 * Given a string s, return the longest happy prefix of s. Return an empty string "" if no such prefix exists.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "level"
 * Output: "l"
 * Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel").
 * The largest prefix which is also suffix is given by "l".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "ababab"
 * Output: "abab"
 * Explanation: "abab" is the largest prefix which is also suffix. They can overlap in the original string.
 */

package final450DSA.strings;

public class LongestPrefixSufixKMPAlgo {
    static class Solution {
        public String longestPrefix(String s) {
            int len = s.length();
            int[] arr = new int[len];

            int i = 0, j = 1;
            while (j < len) {
                if (s.charAt(i) == s.charAt(j)) {
                    arr[j] = i + 1;
                    i++;
                    j++;
                } else {
                    if (i == 0) {
                        arr[j] = 0;
                        j++;
                    } else {
                        i = arr[i - 1];
                    }
                }
            }
            return s.substring(0, arr[len - 1]);
        }
    }
}
