/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-02-2022/02/2022
 *   Time: 09:27 PM
 *   File: PalindromeString
 */

/**
 * Given a string S, check if it is palindrome or not.
 */

package final450DSA.strings;

public class PalindromeString {
    public static int isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        if (str.toString().equals(s)) {
            return 1;
        } else {
            return 0;
        }
    }
}
