/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-02-2022/02/2022
 *   Time: 07:34 PM
 *   File: WordPattern
 */

package final450DSA.strings;

public class WordPattern {
    static class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words = s.split(" ");

            if (words.length != pattern.length()) {
                return false;
            }
        }
    }
}
