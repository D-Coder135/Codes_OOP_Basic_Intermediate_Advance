/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 03-03-2022/03/2022
 *   Time: 10:13 AM
 *   File: MergeSortedArrays
 */

package leetCodes;

public class MergeSortedArrays {
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j = 0;
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }
}
