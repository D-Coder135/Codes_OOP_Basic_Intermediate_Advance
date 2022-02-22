/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-02-2022/02/2022
 *   Time: 06:40 PM
 *   File: SecondFrequent
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

                }
            }
        }
    }
}
