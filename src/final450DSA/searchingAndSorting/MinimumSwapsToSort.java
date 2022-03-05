/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 05-03-2022/03/2022
 *   Time: 07:43 PM
 *   File: MinimumSwapsToSort
 */

/**
 * GFG QUESTION =>
 * <p>
 * Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * nums = {2, 8, 5, 4}
 * Output:
 * 1
 * Explanation:
 * swap 8 with 4.
 * Example 2:
 * <p>
 * Input:
 * nums = {10, 19, 6, 3, 5}
 * Output:
 * 2
 * Explanation:
 * swap 10 with 3 and swap 19 with 5.
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
            return counter;
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
