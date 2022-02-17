/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 17-02-2022/02/2022
 *   Time: 02:56 PM
 *   File: NextPermutation
 */

/**
 * LEETCODE QUESTION 31 =>
 * <p>
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 * <p>
 * For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
 * More formally, if all the permutations of the array are sorted in one container according to their lexicographical
 * order, then the next permutation of that array is the permutation that follows it in the sorted container.
 * If such arrangement is not possible, the array must be rearranged as the lowest possible order
 * (i.e., sorted in ascending order).
 * <p>
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger
 * rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 * <p>
 * The replacement must be in place and use only constant extra memory.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 */

package leetCodes;

import java.util.List;

public class NextPermutation {
    static class Solution {
        static List<Integer> nextPermutation(int N, int[] arr) {
            // code here
            int firstIndex = N - 1;

            for (int i = N - 2; i >= 0; i--) {
                if (arr[firstIndex] <= arr[i]) {
                    firstIndex = i;
                } else {
                    break;
                }
            }

            if (firstIndex != 0) {

            }
        }
    }
}
