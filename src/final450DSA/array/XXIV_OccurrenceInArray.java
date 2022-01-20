/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-01-2022/01/2022
 *   Time: 11:27 AM
 *   File: XXIV_OccurenceInArray
 */

/**
 * Given an array of size n and a number k, find all elements that appear more than n/k times
 */


package final450DSA.array;

import java.util.Map;
import java.util.TreeMap;

public class XXIV_OccurrenceInArray {
    static void printElements(int[] arr, int n, int k) {
        int x = n / k;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry m : map.entrySet()) {
            if ((int) m.getValue() > x) {

            }
        }
    }
}
