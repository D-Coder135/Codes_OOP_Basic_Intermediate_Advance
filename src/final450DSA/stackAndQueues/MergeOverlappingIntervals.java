/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-04-2022/04/2022
 *   Time: 10:38 PM
 *   File: MergeOverlappingIntervals
 */

/**
 * LEETCODE QUESTION 56 =>
 * <p>
 * Given an array of intervals where intervals[i] = [start i, end i], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * <p>
 * Example 2:
 * <p>
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

package final450DSA.stackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
            Stack<int[]> stack = new Stack<>();

            for (int[] interval : intervals) {
                if (stack.isEmpty() || stack.peek()[1] < interval[0]) {
                    stack.push(interval);
                } else {
                    stack.peek()[1] = Math.max(interval[1], stack.peek()[1]);
                }
            }

            int size = stack.size();
            int[][] res = new int[size][];

            while (!stack.isEmpty()) {
                res[--size] = stack.pop();
            }
            return res;
        }

    }
}
