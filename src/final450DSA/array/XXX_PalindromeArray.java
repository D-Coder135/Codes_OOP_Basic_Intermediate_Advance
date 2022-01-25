/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 12:39 PM
 *   File: XXX_PalindromeArray
 */

/**
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if
 * all the elements of the Array are palindrome otherwise it will return 0.
 * <p>
 * <p>
 * Example:
 * Input:
 * 2
 * 5
 * 111 222 333 444 555
 * 3
 * 121 131 20
 * <p>
 * Output:
 * 1
 * 0
 * <p>
 * Explanation:
 * For First test case.
 * n=5;
 * A[0] = 111    //which is a palindrome number.
 * A[1] = 222   //which is a palindrome number.
 * A[2] = 333   //which is a palindrome number.
 * A[3] = 444  //which is a palindrome number.
 * A[4] = 555  //which is a palindrome number.
 * As all numbers are palindrome so This will return 1.
 */

package final450DSA.array;

public class XXX_PalindromeArray {
    public static int palinArray(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int r = 0;
            int rev = 0;
            int temp = a[i];
            while (a[i] != 0) {
                r = a[i] % 10;
                rev = (rev * 10) + r;
                a[i] = a[i] / 10;
            }
            if (rev == temp) {
                count++;
            }
        }
        if (count == n) {
            return 1;
        }
        return 0;
    }
}
