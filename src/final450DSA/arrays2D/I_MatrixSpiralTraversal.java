/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 03:23 PM
 *   File: I_MatrixSpiralTraversal
 */

/**
 * Given a matrix of size r*c. Traverse the matrix in spiral form.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * r = 4, c = 4
 * matrix[][] = {{1, 2, 3, 4},
 * {5, 6, 7, 8},
 * {9, 10, 11, 12},
 * {13, 14, 15,16}}
 * Output:
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */

package final450DSA.arrays2D;

import java.util.ArrayList;

public class I_MatrixSpiralTraversal {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, down = r - 1, left = 0, right = c - 1;
        int dir = 0;

        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top += 1;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    list.add(matrix[i][right]);
                }
                right -= 1;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
                down -= 1;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left += 1;
            }
            dir = (dir + 1) % 4;
        }
        return list;
    }
}
