/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 24-04-2022/04/2022
 *   Time: 10:49 PM
 *   File: MaxAreaHistogram
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class MaxAreaHistogram {
    static class Solution {
        //Function to find largest rectangular area possible in a given histogram.
        public static long getMaxArea(long arr[], long n) {
            // your code here
            Stack<Integer> stack = new Stack<>();
            long maxArea = 0;

            for (int i = 0; i < arr.length; ) {
                if (stack.isEmpty() || arr[i] > arr[stack.peek()]) {
                    stack.push(i);
                    i++;
                } else {
                    int right = i;
                    long height = arr[stack.pop()];
                    if (stack.isEmpty()) {
                        long area = height * right;
                        maxArea = Math.max(maxArea, area);
                    } else {
                        int left = stack.peek();
                        long area = height * (right - left - 1);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }

            int right = arr.length;
            while (!stack.isEmpty()) {
                long height = arr[stack.pop()];
                if (stack.isEmpty()) {
                    long area = height * right;
                    maxArea = Math.max(maxArea, area);
                } else {
                    int left = stack.peek();
                    long area = height * (right - left - 1);
                    maxArea = Math.max(maxArea, area);
                }
            }
            return maxArea;
        }

    }
}
