/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 14-02-2022/02/2022
 *   Time: 08:02 PM
 *   File: CountAndSay
 */

/**
 * LEETCODE QUESTION 38 =>
 * <p>
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a
 * different digit string.
 * To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a
 * contiguous section all the same character. Then for each group, say the number of characters, then say the character.
 * To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
 * <p>
 * Given a positive integer n, return the nth term of the count-and-say sequence.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * Output: "1"
 * Explanation: This is the base case.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 4
 * Output: "1211"
 * Explanation:
 * countAndSay(1) = "1"
 * countAndSay(2) = say "1" = one 1 = "11"
 * countAndSay(3) = say "11" = two 1's = "21"
 * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */

package final450DSA.strings;

public class CountAndSay {
    static class Solution {
        public String countAndSay(int n) {
            if (n == 1) {
                return "1";
            }
            String result = countAndSay(n - 1);
            return helper(result);
        }
    }
}
