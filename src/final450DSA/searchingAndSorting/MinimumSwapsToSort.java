/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 05-03-2022/03/2022
 *   Time: 07:43 PM
 *   File: MinimumSwapsToSort
 */

package final450DSA.searchingAndSorting;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapsToSort {
    static class Solution {
        //Function to find the minimum number of swaps required to sort the array.
        public int minSwaps(int[] nums) {
            // Code here
            Pair[] arr = new Pair[nums.length];
            int counter = 0;

            for (int i = 0; i < nums.length; i++) {
                arr[i] = new Pair(nums[i], i);
            }

            Arrays.sort(arr, Comparator.comparingInt(a -> a.value));

            for (int i = 0; i < nums.length; i++) {
                while (arr[i].index != i) {
                    swap(arr, i, arr[i].index);
                    counter++;
                }
            }
        }

        private void swap(Pair[] arr, int i, int index) {
            Pair temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }

        static class Pair {
            int index, value;

            public Pair(int value, int index) {
                this.value = value;
                this.index = index;
            }
        }

    }
}
