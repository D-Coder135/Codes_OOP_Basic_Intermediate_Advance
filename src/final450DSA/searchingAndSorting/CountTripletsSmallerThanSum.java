/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 02-03-2022/03/2022
 *   Time: 11:50 PM
 *   File: CountTripletsSmallerThanSum
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class CountTripletsSmallerThanSum {
    static class Solution {
        long countTriplets(int[] arr, int n, int sum) {
            long counter = 0;
            Arrays.sort(arr);

            for (int k = 0; k < n - 2; k++) {
                int i = k + 1;
                int j = n - 1;

                while (i < j) {
                    long addSum = arr[k] + arr[i] + arr[j];

                    if (addSum < sum) {
                        counter += j - i;
                        i++;
                    } else {
                        j++;
                    }
                }
            }
        }
    }
}
