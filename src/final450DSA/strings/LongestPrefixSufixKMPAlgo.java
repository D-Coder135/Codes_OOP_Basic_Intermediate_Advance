/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-02-2022/02/2022
 *   Time: 11:07 AM
 *   File: LongestPrefixSufixKMPAlgo
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
