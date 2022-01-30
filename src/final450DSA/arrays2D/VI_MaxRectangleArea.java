/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30-01-2022/01/2022
 *   Time: 09:48 PM
 *   File: VI_MaxRectangleArea
 */

/**
 * IMPORTANT QUESTION (LEETCODE QUESTION 85) =>
 * <p>
 * Given a binary matrix M of size n X m. Find the maximum area of a rectangle formed only of 1s in the given matrix.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 4, m = 4
 * M[][] = {{0 1 1 0},
 * {1 1 1 1},
 * {1 1 1 1},
 * {1 1 0 0}}
 * Output: 8
 * Explanation: For the above test case the
 * matrix will look like
 * 0 1 1 0
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 0 0
 * the max size rectangle is
 * 1 1 1 1
 * 1 1 1 1
 * and area is 4 *2 = 8.
 */

package final450DSA.arrays2D;

import java.util.Stack;

public class VI_MaxRectangleArea {
    // GFG Solution
    public int maxArea(int[][] M, int n, int m) {
        int[] arr = M[0];
        int maxarea = getArea(arr, m);
        int k = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] == 0) {
                    arr[k++] = 0;
                } else {
                    arr[k++] += M[i][j];
                }
            }
            k = 0;
            int currentarea = getArea(arr, m);
            maxarea = Math.max(maxarea, currentarea);
        }
        return maxarea;
    }

    int getArea(int[] arr, int n) {
        int[] ps = previousSmaller(arr);
        int[] ns = nextSmaller(arr);
        int maxarea = 0;
        for (int i = 0; i < n; i++) {
            int area = ((ns[i] - ps[i]) - 1) * arr[i];
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }

    int[] previousSmaller(int[] arr) {
        int[] ps = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    int[] nextSmaller(int[] arr) {
        int[] ns = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ns[i] = arr.length;
            } else {
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }
}
