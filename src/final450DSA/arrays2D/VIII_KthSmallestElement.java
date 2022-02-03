/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-02-2022/02/2022
 *   Time: 11:12 AM
 *   File: VIII_KthSmallestElement
 */

/**
 * Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth the smallest element
 * in the matrix.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * mat[][] =     {{16, 28, 60, 64},
 * {22, 41, 63, 91},
 * {27, 50, 87, 93},
 * {36, 78, 87, 94 }}
 * K = 3
 * Output: 27
 * Explanation: 27 is the 3rd smallest element.
 */

package final450DSA.arrays2D;

public class VIII_KthSmallestElement {
    public static int kthSmallestElement(int[][] matrix, int n, int k) {
        int[] oneDArray = new int[n * n];
        int index = 0;
        int ansIndex = k - 1;

        for (int[] arr : matrix) {
            for (int value : arr) {
                oneDArray[index++] = value;
            }
        }
    }
}
