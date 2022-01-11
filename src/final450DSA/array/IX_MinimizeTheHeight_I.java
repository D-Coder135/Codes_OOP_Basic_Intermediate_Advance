/**
 * Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each
 * tower either by increasing or decreasing them by K only once.
 * Find out what could be the possible minimum difference of the height of shortest and longest towers after
 * you have modified each tower.
 *
 * Note: Assume that height of the tower can be negative.
 *
 * <p>
 * Example 1:
 * <p>
 * Input:
 * K = 2, N = 4
 * Arr[] = {1, 5, 8, 10}
 * Output:
 * 5
 * Explanation:
 * The array can be modified as
 * {3, 3, 6, 8}. The difference between
 * the largest and the smallest is 8-3 = 5.
 */


package final450DSA.array;

import java.util.Arrays;

public class IX_MinimizeTheHeight_I {

    int getMinDiff(int[] arr, int n, int k) {
        // code here

        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k);

        int tempMax = arr[n - 1] - k;

        int tempMin = arr[0] + k;

        int max, min;

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(tempMax, arr[i] + k);
            min = Math.min(tempMin, arr[i + 1] - k);

            ans = Math.min(ans, max - min);
        }
        return ans;
    }

}
