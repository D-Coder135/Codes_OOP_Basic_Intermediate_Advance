/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 21-01-2022/01/2022
 *   Time: 11:18 PM
 *   File: XXVI_TripletSum
 */

/**
 * Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given
 * integer X.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 6, X = 13
 * arr[] = [1 4 45 6 10 8]
 * Output:
 * 1
 * Explanation:
 * The triplet {1, 4, 8} in
 * the array sums up to 13.
 */

package final450DSA.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class XXVI_TripletSum {

    public static boolean find3Numbers(int[] A, int n, int X) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            set.add(num);
        }

        List<Integer> list = new ArrayList<>(set);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {

            }
        }
    }
}
