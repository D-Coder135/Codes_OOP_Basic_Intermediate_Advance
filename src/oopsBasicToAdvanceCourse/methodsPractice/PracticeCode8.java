/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16/08/21
 *   Time: 10:23 PM
 *   File: PracticeCode8.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to enter a number.
 2. Program calls method which takes int as an argument and returns sum of all digits in this number.
 3. Program prints sum of all digits to the console.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer: ");
        int number = sc.nextInt();

        int sumOfDigits = sumDigitsInNumber(number);
        System.out.println(sumOfDigits);
    }

    public static int sumDigitsInNumber(int number) {
        int digits = 0, sumOfDigits = 0;
        while (number != 0) {
            digits = number % 10;
            sumOfDigits += digits;
            number /= 10;
        }
        return sumOfDigits;
    }
}
