/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 02:15 PM
 *   File: II_SearchIn2DMatrix
 */

/**
 * LEETCODE QUESTION 74 =>
 * <p>
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix.
 * This matrix has the following properties:
 * <p>
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */

package final450DSA.arrays2D;

public class II_SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] a : matrix) {
            if (target >= a[0] && target <= a[matrix[0].length - 1]) {
                for (int element : a) {
                    if (target == element)
                        return true;
                }
            }
        }
        return false;
    }
}
