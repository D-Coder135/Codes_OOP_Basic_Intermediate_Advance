/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-02-2022/02/2022
 *   Time: 08:12 PM
 *   File: SmallestDistinctWindow
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
            int[] visited = new int[254];

            for (int i = 0; i < str.length(); i++) {
                visited[str.charAt(i) - 65]++;

                if (visited[str.charAt(i) - 65] == 1) {
                    counter++;
                }

                if (counter == distinctCount) {
                    while (visited[str.charAt(start) - 65] > 1) {
                        if (visited[str.charAt(start) - 65] > 1) {
                            visited[str.charAt(start) - 65]--;
                            start++;
                        }
                        int current_len = i - start + 1;
                        if (current_len < min_length) {

                        }
                    }
                }
            }
        }
    }
}
