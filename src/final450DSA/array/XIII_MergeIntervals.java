/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return
 * an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */


package final450DSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class XIII_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (Comparator.comparingInt(o -> o[0])));

        ArrayList<int[]> ans = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        return ans.toArray(new int[0][]);
    }
}
