/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 08:10 PM
 *   File: TheCelebrityProblem
 */

/**
 * GFG QUESTION =>
 * <p>
 * A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people,
 * find if there is a celebrity in the party or not. A square NxN matrix M[][] is used to represent people at the
 * party such that if an element of row i and column j  is set to 1 it means ith person knows jth person.
 * Here M[i][i] will always be 0.
 * Note: Follow 0 based indexing.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 3
 * M[][] = {{0 1 0},
 * {0 0 0},
 * {0 1 0}}
 * Output: 1
 * Explanation: 0th and 2nd person both
 * know 1. Therefore, 1 is the celebrity.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 2
 * M[][] = {{0 1},
 * {1 0}}
 * Output: -1
 * Explanation: The two people at the party both
 * know each other. None of them is a celebrity.
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class TheCelebrityProblem {
    static class Solution {
        //Function to find if there is a celebrity in the party or not.
        int celebrity(int[][] arr, int n) {
            // code here
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                stack.push(i);
            }

            while (stack.size() >= 2) {
                int i = stack.pop();
                int j = stack.pop();

                if (arr[i][j] == 1) {
                    stack.push(j);
                } else {
                    stack.push(i);
                }
            }

            int potentialAns = stack.pop();

            for (int i = 0; i < arr.length; i++) {
                if (i != potentialAns) {
                    if (arr[i][potentialAns] == 0 || arr[potentialAns][i] == 1) {
                        return -1;
                    }
                }
            }
            return potentialAns;
        }
    }
}
