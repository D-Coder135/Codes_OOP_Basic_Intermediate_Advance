/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-01-2022
 *   Time: 06:01 PM
 *   File: XV_CountInversions.java
 */

/**
 * Given an array of integers. Find the Inversion Count in the array.
 * <p>
 * Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted.
 * If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the
 * inversion count is the maximum.
 * Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 5, arr[] = {2, 4, 1, 3, 5}
 * Output: 3
 * Explanation: The sequence 2, 4, 1, 3, 5
 * has three inversions (2, 1), (4, 1), (4, 3).
 * <p>
 * Example 2:
 * <p>
 * Input: N = 5
 * arr[] = {2, 3, 4, 5, 6}
 * Output: 0
 * Explanation: As the sequence is already
 * sorted so there is no inversion count.
 */


package final450DSA.array;

public class XV_CountInversions {
    static long inversionCount(long arr[], long N) {
        return mergeSort(arr, 0, (int) N - 1);
    }

    private static long mergeSort(long[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;

        long left = mergeSort(arr, low, mid);
        long right = mergeSort(arr, mid + 1, high);
        return 0;
    }

}
