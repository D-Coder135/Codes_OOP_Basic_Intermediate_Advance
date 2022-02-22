/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 06:40 PM
 *   File: SecondFrequent
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given
 * sequence.
 * Note: No two strings are the second most repeated, there will be always a single string.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
 * Output: bbb
 * Explanation: "bbb" is the second most
 * occurring string with frequency 2.
 */

package final450DSA.strings;

import java.util.HashMap;

public class SecondFrequent {
    static class Solution {
        String secFrequent(String[] arr, int N) {
            // your code here
            HashMap<String, Integer> map = new HashMap<>();
            for (String str : arr) {
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    map.put(str, 1);
                }
            }

            int max = 0;
            for (String s : map.keySet()) {
                if (map.get(s) > max) {
                    max = map.get(s);
                }
            }

            int secondMax = 0;
            String ans = "";

            for (String key : map.keySet()) {
                if (map.get(key) < max && map.get(key) > secondMax) {
                    secondMax = map.get(key);
                    ans = key;
                }
            }
            return ans;
        }
    }
}
