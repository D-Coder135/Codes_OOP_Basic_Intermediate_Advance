/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 04-03-2022/03/2022
 *   Time: 07:35 PM
 *   File: SortBySetBitCount
 */

/**
 * LEETCODE QUESTION 1356 =>
 * <p>
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in
 * their binary representation and in case of two or more integers have the same number of 1's you have to sort them
 * in ascending order.
 * <p>
 * Return the array after sorting it.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explanation: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explanation: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
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
