/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-02-2022/02/2022
 *   Time: 09:42 PM
 *   File: Duplicates
 */

package final450DSA.strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    static void printDuplicates(String string) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (!count.containsKey(string.charAt(i))) {
                count.put(string.charAt(i), 1);
            } else {
                count.put(string.charAt(i), count.get(string.charAt(i)) + 1);
            }
        }

        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char) mapElement.getKey();
            int value = (int) mapElement.getValue();

            if (value > 1) {
                System.out.println(key + ", count = " + value);
            }
        }
    }
}
