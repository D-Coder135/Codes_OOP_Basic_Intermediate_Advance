/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 01-03-2022/03/2022
 *   Time: 10:26 AM
 *   File: PairGivenDifference
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class PairGivenDifference {
    static class Solution {
        public boolean findPair(int[] arr, int size, int n) {
            //code here.
            Arrays.sort(arr);

            for (int i = 0; i < size; i++) {
                if (binarySearch(arr, i + 1, size - 1, arr[i] + n)) {
                    return true;
                }
            }
            return false;
        }

        private boolean binarySearch(int[] arr, int low, int high, int target) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    return true;
                } else if (arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return false;
        }
    }
}
