/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 02:52 PM
 *   File: XXXII_MedianOfDifferentSize
 */

package final450DSA.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class XXXII_MedianOfDifferentSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
//        int[] arr1 = {-5, 3, 6, 12, 15};
//        int[] arr2 = {-12, -10, -6, -3, 4, 10};
//        int n = arr1.length;
//        int m = arr2.length;

        System.out.println(calcMedian(arr1, arr2, m, n));
    }

    private static int calcMedian(int[] arr1, int[] arr2, int size1, int size2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr1) {
            arrayList.add(i);
        }
        for (int i : arr2) {
            arrayList.add(i);
        }

        Collections.sort(arrayList);

        if (arrayList.size() % 2 == 0) {
            return ((arrayList.get(arrayList.size() / 2) + arrayList.get((arrayList.size() / 2) - 1)) / 2);
        }
        return arrayList.get(arrayList.size() / 2);
    }
}
