/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-01-2022/01/2022
 *   Time: 12:53 PM
 *   File: XIX_AlternatePositveNegative
 */

/**
 * Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate
 * positive and negative numbers without changing the relative order of positive and negative numbers.
 * Note: Array should start with positive number.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 9
 * Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
 * Output:
 * 9 -2 4 -1 5 -5 0 -3 2
 */

package final450DSA.array;

import java.util.ArrayList;
import java.util.List;

public class XIX_AlternatePositveNegative {

    void rearrange(int[] arr, int n) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positives.add(arr[i]);
            } else {
                negatives.add(arr[i]);
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < positives.size() && k < negatives.size()) {
            if (i % 2 == 0) {
                arr[i] = positives.get(j);
                j++;
            } else {
                arr[i] = negatives.get(k);
                k++;
            }
            i++;
        }
        while (j < positives.size()) {
            arr[i] = positives.get(j);
            j++;
            i++;
        }
        while (k < negatives.size()) {
            arr[i] = negatives.get(k);
            k++;
            i++;
        }
    }

}
