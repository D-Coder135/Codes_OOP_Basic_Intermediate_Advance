/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 08:10 PM
 *   File: TheCelebrityProblem
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
        }
    }
}
