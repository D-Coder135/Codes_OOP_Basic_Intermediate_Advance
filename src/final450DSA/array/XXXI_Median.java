/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 12:41 PM
 *   File: XXXI_Median
 */

/**
 * Given an array arr[] of N integers, calculate the median
 * <p>
 * Example 1:
 * <p>
 * Input: N = 5
 * arr[] = 90 100 78 89 67
 * Output: 89
 * Explanation: After sorting the array
 * middle element is the median
 * <p>
 * Example 2:
 * <p>
 * Input: N = 4
 * arr[] = 56 67 30 79
 * Output: 61
 * Explanation: In case of even number of
 * elements, average of two middle elements
 * is the median.
 */

package final450DSA.array;

import java.util.Arrays;

public class XXXI_Median {

    public int find_median(int[] v) {
        // Code here
        Arrays.sort(v);
        if (v.length % 2 == 0) {
            return (v[v.length / 2] + v[(v.length / 2) - 1]) / 2;
        }
        return v[(v.length / 2)];
    }

}
