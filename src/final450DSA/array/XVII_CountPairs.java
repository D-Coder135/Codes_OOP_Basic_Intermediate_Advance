/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-01-2022/01/2022
 *   Time: 10:52 AM
 *   File: XVII_CountPairs
 */

package final450DSA.array;

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
