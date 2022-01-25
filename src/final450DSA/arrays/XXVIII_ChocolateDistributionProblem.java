/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 12:31 PM
 *   File: XXVIII_ChocolateDistributionProblem
 */

/**
 * Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates
 * in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to
 * distribute chocolate packets among M students such that :
 * 1. Each student gets exactly one packet.
 * 2. The difference between maximum number of chocolates given to a student and minimum number of chocolates
 * given to a student is minimum.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 8, M = 5
 * A = {3, 4, 1, 9, 56, 7, 9, 12}
 * Output: 6
 * Explanation: The minimum difference between
 * maximum chocolates and minimum chocolates
 * is 9 - 3 = 6 by choosing following M packets :
 * {3, 4, 9, 7, 9}.
 */

package final450DSA.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class XXVIII_ChocolateDistributionProblem {
    public long findMinDiff(ArrayList<Long> a, long n, long m) {
        Collections.sort(a);

        long maxValue = Long.MAX_VALUE;
        long x = m - 1;

        for (int i = 0; x < n; i++) {
            long val = a.get((int) x) - a.get(i);
            if (val < maxValue) {
                maxValue = val;
            }
            x++;
        }
        return maxValue;
    }
}
