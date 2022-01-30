/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 02:25 PM
 *   File: III_MedianRowWiseSorted
 */

package final450DSA.arrays2D;

import java.util.ArrayList;
import java.util.Collections;

public class III_MedianRowWiseSorted {
    int median(int[][] matrix, int r, int c) {
        // code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] a : matrix) {
            for (int element : a) {
                arrayList.add(element);
            }
        }
        Collections.sort(arrayList);
        return arrayList.get((arrayList.size() / 2));
    }
}
