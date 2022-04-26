/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 26-04-2022/04/2022
 *   Time: 11:18 PM
 *   File: RemoveMinInvalidParentheses
 */

package final450DSA.stackAndQueues;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveMinInvalidParentheses {
    static class Solution {
        public List<String> removeInvalidParentheses(String s) {

            HashSet<String> set = new HashSet<>();
            List<String> ansList = new ArrayList<>();

            int min = getMin(s);
            solution(s, min, set, ansList);

            return ansList;

        }
    }
}
