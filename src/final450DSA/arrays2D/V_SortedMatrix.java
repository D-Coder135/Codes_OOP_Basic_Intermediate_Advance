/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 02:57 PM
 *   File: V_SortedMatrix
 */

package final450DSA.arrays2D;

import java.util.ArrayList;
import java.util.Collections;

public class V_SortedMatrix {
    int[][] sortedMatrix(int N, int[][] Mat) {
        // code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] a : Mat) {
            for (int element : a) {
                arrayList.add(element);
            }
        }
        Collections.sort(arrayList);
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Mat[i][j] = arrayList.get(index++);
            }
        }
        return Mat;
    }
}
