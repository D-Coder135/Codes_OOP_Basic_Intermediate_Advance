/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 02:52 PM
 *   File: XXXII_MedianOfDifferentSize
 */

package final450DSA.arrays;

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

        System.out.println(calcMedian(arr1, arr2, m, n));
    }

    private static int calcMedian(int[] arr1, int[] arr2, int size1, int size2) {
        return 0;
    }
}
