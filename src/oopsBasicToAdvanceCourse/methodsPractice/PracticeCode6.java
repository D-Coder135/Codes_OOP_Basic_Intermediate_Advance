/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 15/08/21
 *   Time: 11:29 PM
 *   File: PracticeCode6.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to enter length on array.
 2. Program generates array of random integer numbers (use java.util.Random) with array length specified by user.
 3. Program creates the second array with size of twice as much as the first array.
 4. The first elements in the new array are first the same elements as in the old array. The other half of elements are
    elements as in the first array multiplied by two.

For example, if the user set initial array length as ten:
array #1 = {1,3,5,7,10,11,12,15,17,20} (generated randomly)
array #1 = {1,3,5,7,10,11,12,15,17,20,2,6,10,14,20,22,24,30,34,40}
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeCode6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }
}
