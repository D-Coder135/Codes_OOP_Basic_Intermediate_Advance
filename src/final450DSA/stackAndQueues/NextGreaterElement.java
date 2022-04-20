/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 07:00 PM
 *   File: NextGreaterElement
 */

package final450DSA.stackAndQueues;

import java.util.Stack;

public class NextGreaterElement {
    static class Solution {
        //Function to find the next greater element for each element of the array.
        public static long[] nextLargerElement(long[] arr, int n) {
            // Your code here
            Stack<Integer> stack = new Stack<>();
            long[] ans = new long[n];

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                    ans[stack.pop()] = arr[i];
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                ans[stack.pop()] = -1;
            }

            return ans;
        }
    }
}