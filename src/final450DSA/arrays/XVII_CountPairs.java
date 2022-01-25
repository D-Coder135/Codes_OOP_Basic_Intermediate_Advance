/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-01-2022/01/2022
 *   Time: 10:52 AM
 *   File: XVII_CountPairs
 */

/**
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum
 * is equal to K.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4, K = 6
 * arr[] = {1, 5, 7, 1}
 * Output: 2
 * Explanation:
 * arr[0] + arr[1] = 1 + 5 = 6
 * and arr[1] + arr[3] = 5 + 1 = 6.
 */

package final450DSA.arrays;

import java.util.HashMap;

public class XVII_CountPairs {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int value : arr) {
            if (hashMap.containsKey(k - value)) {
                count += hashMap.get(k - value);
            }
            hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
        }
        return count;
    }
}
