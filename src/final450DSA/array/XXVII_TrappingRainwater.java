/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 22-01-2022/01/2022
 *   Time: 12:22 AM
 *   File: XXVII_TrappingRainwater
 */

/**
 * Given an array arr[] of N non-negative integers representing the height of blocks.
 * If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * arr[] = {3,0,0,2,0,4}
 * Output:
 * 10
 */

package final450DSA.array;

public class XXVII_TrappingRainwater {
    static long trappingWater(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {

        }
    }
}
