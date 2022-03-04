/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-03-2022/03/2022
 *   Time: 06:44 PM
 *   File: IV_ChampagneTower
 */

package leetCodes.March2022;

import java.util.ArrayList;
import java.util.List;

public class IV_ChampagneTower {
    static class Solution {
        public double champagneTower(int poured, int query_row, int query_glass) {
            if (poured == 0)
                return 0;

            List<Double> list = new ArrayList<>();
            list.add((double) poured);

            while (query_row-- > 0) {
                List<Double> temp = new ArrayList<>();
                temp.add(Math.max(((list.get(0) - 1) / 2), 0));
                for (int i = 1; i < list.size(); i++) {
                    temp.add(Math.max(((list.get(i - 1) - 1) / 2), 0) + Math.max((list.get(i) - 1) / 2, 0));
                }
                temp.add(Math.max(((list.get(0) - 1) / 2), 0));
                list = new ArrayList<>(temp);
            }
            return Math.min(1, list.get(query_glass));
        }
    }
}
