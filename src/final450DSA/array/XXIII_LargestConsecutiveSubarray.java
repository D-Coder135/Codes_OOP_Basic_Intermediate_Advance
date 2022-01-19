/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-01-2022/01/2022
 *   Time: 11:57 PM
 *   File: XXIII_LargestConsecutiveSubarray
 */

/**
 * Given an array of positive integers. Find the length of the longest sub-sequence such that elements
 * in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 7
 * a[] = {2,6,1,9,4,5,3}
 * Output:
 * 6
 * Explanation:
 * The consecutive numbers here
 * are 1, 2, 3, 4, 5, 6. These 6
 * numbers form the longest consecutive
 * subsquence.
 * Exampl
 */

package final450DSA.array;

import java.util.TreeSet;

public class XXIII_LargestConsecutiveSubarray {
    static int findLongestConseqSubseq(int[] arr, int N) {
        int count = 1, max = -1;
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : arr) {
            set.add(x);
        }
        for (Integer i : set) {
            if (set.contains(i + 1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }
        return max;
    }
}
