/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 10:01 AM
 *   File: MergeWithoutExtraSpace
 */

package final450DSA.searchingAndSorting;

public class MergeWithoutExtraSpace {
    static class Solution {

        public void merge(int[] arr1, int[] arr2, int n, int m) {
            // code here
            int i = 0, j = 0, k = n - 1;

            while (i <= k && j < m) {
                if (arr1[i] < arr2[j]) {
                    i++;
                }
            }
        }
    }
}
