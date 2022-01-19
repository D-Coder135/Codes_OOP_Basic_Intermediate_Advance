/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-01-2022/01/2022
 *   Time: 12:55 PM
 *   File: XXI_FactorialLargeNumbers
 */

/**
 * Given an integer N, find its factorial.
 * <p>
 * Example 1:
 * <p>
 * Input: N = 5
 * Output: 120
 * Explanation : 5! = 1*2*3*4*5 = 120
 * <p>
 * Example 2:
 * <p>
 * Input: N = 10
 * Output: 3628800
 * Explanation :
 * 10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
 */


package final450DSA.array;

import java.math.BigInteger;
import java.util.ArrayList;

public class XXI_FactorialLargeNumbers {
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String temp = factorial.toString();

        for (int i = 0; i < temp.length(); i++) {
            int number = Integer.parseInt(String.valueOf(temp.charAt(i)));
            arrayList.add(number);
        }
    }
}
