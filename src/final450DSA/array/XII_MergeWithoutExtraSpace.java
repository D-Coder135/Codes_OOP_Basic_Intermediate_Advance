/**
 * Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
 * Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, M = 5
 * arr1[] = {1, 3, 5, 7}
 * arr2[] = {0, 2, 6, 8, 9}
 * Output: 0 1 2 3 5 6 7 8 9
 * Explanation: Since you can't use any
 * extra space, modify the given arrays
 * to form
 * arr1[] = {0, 1, 2, 3}
 * arr2[] = {5, 6, 7, 8, 9}
 */


package final450DSA.array;

import java.util.Arrays;

public class XII_MergeWithoutExtraSpace {

    public void merge(int[] arr1, int[] arr2, int n, int m) {
        // code here
        int i = 0;
        int j = 0, k = n - 1;

        while (i <= k && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

}
