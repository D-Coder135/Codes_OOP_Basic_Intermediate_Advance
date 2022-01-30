/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 02:47 PM
 *   File: IV_RowWithMax1
 */

package final450DSA.arrays2D;

public class IV_RowWithMax1 {
    int rowWithMax1s(int[][] arr, int n, int m) {
        // code here
        int max = -1;
        int c = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (c < count) {
                c = count;
                max = i;
            }
            count = 0;
        }
        return max;
    }
}
