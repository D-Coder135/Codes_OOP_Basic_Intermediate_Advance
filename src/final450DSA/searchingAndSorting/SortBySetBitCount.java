/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-03-2022/03/2022
 *   Time: 07:35 PM
 *   File: SortBySetBitCount
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;

public class SortBySetBitCount {
    static class Solution {
        public int[] sortByBits(int[] arr) {

            int n = arr.length;
            for (int i = 0; i < n; i++)
                arr[i] += 10001 * Integer.bitCount(arr[i]);

            Arrays.sort(arr);

            for (int i = 0; i < n; i++)
                arr[i] = arr[i] % 10001;
            return arr;
        }
    }
}
