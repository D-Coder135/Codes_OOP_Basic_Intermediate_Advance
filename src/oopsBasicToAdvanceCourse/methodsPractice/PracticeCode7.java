/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16/08/21
 *   Time: 8:14 PM
 *   File: PracticeCode7.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to enter two numbers separated by space.
 2. Program calls specific method to find the greatest common divisor.
 3. Program prints the greatest common divisor to the console.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        String[] inputArgumentsArray = userInput.split("\\s+");
        int number1 = Integer.parseInt(inputArgumentsArray[0]);
        int number2 = Integer.parseInt(inputArgumentsArray[1]);

        System.out.println(gcdRecursive(number1, number2));
    }

    public static int gcdRecursive(int firstNumber, int secondNumber) {
//		<write your code here>

    }

    public static int lcm(int firstnumber, int secondnumber) {
        int lcm = Math.max(firstnumber, secondnumber);
        while (true) {
            if (lcm % firstnumber == 0 && lcm % secondnumber == 0) {

            }
        }
    }

}
}
