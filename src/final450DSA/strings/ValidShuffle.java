/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-02-2022/02/2022
 *   Time: 11:12 PM
 *   File: ValidShuffle
 */

/**
 * EXAMPLES =>
 * <p>
 * 1XY2 is a valid shuffle of XY and 12
 * Y1X2 is a valid shuffle of XY and 12
 * Y21XX is not a valid shuffle of XY and 12
 */

package final450DSA.strings;

import java.util.Arrays;

public class ValidShuffle {
    static boolean checkLength(String str1, String str2, String result) {
        return str1.length() + str2.length() == result.length();
    }

    static String sortString(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);

        string = String.valueOf(charArray);

        return string;
    }

    static boolean shuffleCheck(String str1, String str2, String result) {
        str1 = sortString(str1);
        str2 = sortString(str2);
        result = sortString(result);

        int i = 0, j = 0, k = 0;

        while (k != result.length()) {
            if (i < str1.length() && str1.charAt(i) == result.charAt(k)) {
                i++;
            }
        }
    }
}
