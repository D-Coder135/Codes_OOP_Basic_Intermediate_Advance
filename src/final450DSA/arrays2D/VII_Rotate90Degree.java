/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 31-01-2022/01/2022
 *   Time: 11:41 PM
 *   File: VII_Rotate90Degree
 */

/**
 * Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.
 */

package final450DSA.arrays2D;

public class VII_Rotate90Degree {
    public static void rotate90(int[][] matrix) {
        int n = matrix.length;

        // First Rotate the matrix with respect to the main diagonal.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Second Rotate the matrix with respect to the middle column.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int value : rows) {
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}
