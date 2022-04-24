/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-04-2022/04/2022
 *   Time: 10:38 PM
 *   File: MergeOverlappingIntervals
 */

package final450DSA.stackAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        }

    }
}
