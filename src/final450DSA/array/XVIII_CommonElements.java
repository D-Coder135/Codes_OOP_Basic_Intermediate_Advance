/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-01-2022/01/2022
 *   Time: 12:03 PM
 *   File: XVIII_CommonElements
 */

/**
 * Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
 * Note: can you take care of the duplicates without using any additional Data Structure?
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n1 = 6; A = {1, 5, 10, 20, 40, 80}
 * n2 = 5; B = {6, 7, 20, 80, 100}
 * n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
 * Output: 20 80
 * Explanation: 20 and 80 are the only
 * common elements in A, B and C.
 */

package final450DSA.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class XVIII_CommonElements {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int element : A) {
            set1.add(element);
        }
        for (int element : B) {
            set2.add(element);
        }
        for (int element : C) {
            if (set1.contains(element) && set2.contains(element)) {
                arrayList.add(element);
                set1.remove(element);
            }
        }
        return arrayList;
    }
}
