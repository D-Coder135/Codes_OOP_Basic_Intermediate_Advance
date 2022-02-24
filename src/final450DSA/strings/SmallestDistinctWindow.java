/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-02-2022/02/2022
 *   Time: 08:12 PM
 *   File: SmallestDistinctWindow
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a string 's'. The task is to find the smallest window length that contains all the characters of the given
 * string at least one time.
 * For eg. A = aabcbcdbca, then the result would be 4 as of the smallest window will be dbca.
 * <p>
 * Example 1:
 * <p>
 * Input : "AABBBCBBAC"
 * Output : 3
 * Explanation : Sub-string -> "BAC"
 * <p>
 * Example 2:
 * Input : "aaab"
 * Output : 2
 * Explanation : Sub-string -> "ab"
 */

package final450DSA.strings;

import java.util.HashSet;

public class SmallestDistinctWindow {
    static class Solution {
        public String findSubString(String str) {
            // Your code goes here
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }

            int distinctCount = set.size();
            int start = 0, startIndex = 0, min_length = Integer.MAX_VALUE;
            int counter = 0;
            int[] visited = new int[256];

            for (int i = 0; i < str.length(); i++) {
                visited[str.charAt(i) - 65]++;

                if (visited[str.charAt(i) - 65] == 1) {
                    counter++;
                }

                if (counter == distinctCount) {
                    while (visited[str.charAt(start) - 65] > 1) {
                        if (visited[str.charAt(start) - 65] > 1) {
                            visited[str.charAt(start) - 65]--;
                        }
                            start++;
                        }
                        int current_len = i - start + 1;
                        if (current_len < min_length) {
                            min_length = current_len;
                            startIndex = start;
                    }
                }
            }
            return str.substring(startIndex, startIndex + min_length);
        }
    }
}
