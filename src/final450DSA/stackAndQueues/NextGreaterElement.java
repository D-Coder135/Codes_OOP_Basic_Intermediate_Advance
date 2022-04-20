/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-04-2022/04/2022
 *   Time: 07:00 PM
 *   File: NextGreaterElement
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given an array arr[ ] of size N having distinct elements, the task is to find the next greater element for
 * each element of the array in order of their appearance in the array. Next greater element of an element in
 * the array is the nearest element on the right which is greater than the current element. If there does not
 * exist next greater of current element, then next greater element for current element is -1.
 * For example, next greater of the last element is always -1.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, arr[] = [1 3 2 4]
 * Output:
 * 3 4 4 -1
 * Explanation:
 * In the array, the next larger element
 * to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ?
 * since it doesn't exist, it is -1.
 * <p>
 * Example 2:
 * <p>
 * Input:
 * N = 5, arr[] [6 8 0 1 3]
 * Output:
 * 8 -1 1 3 -1
 * Explanation:
 * In the array, the next larger element to
 * 6 is 8, for 8 there is no larger elements
 * hence it is -1, for 0 it is 1 , for 1 it
 * is 3 and then for 3 there is no larger
 * element on right and hence -1.
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
