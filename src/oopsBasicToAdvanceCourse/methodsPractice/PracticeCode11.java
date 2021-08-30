/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30/08/21
 *   Time: 11:30 PM
 *   File: PracticeCode11.java
 */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainLoop:
        while (true) {
            System.out.print("Please, select mode. If you want to convert Roman "
                    + "numbers to decimal - type 'R2D' and press enter."
                    + System.lineSeparator()
                    + "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

            String mode = sc.next();
            if (mode.equalsIgnoreCase("R2D")) {
                while (true) {
                    System.out.print("Please, enter Roman number you want to convert: ");
                    String romanNumber = sc.next();
                    if (isRomanNumberValid(romanNumber)) {
                        System.out.println(roman2Decimal(romanNumber));
                        break mainLoop;
                    } else {
                        System.out.println("You entered invalid Roman number. "
                                + "Please, try one more time.");
                        continue;
                    }
                }
            } else if (mode.equalsIgnoreCase("D2R")) {
                while (true) {
                    System.out.print("Please, enter decimal number "
                            + "you want to convert: ");
                    int decimalNumber = sc.nextInt();
                    if (isDecimalNumberValid(decimalNumber)) {
                        System.out.println(decimal2Roman(decimalNumber));
                        break mainLoop;
                    } else {
                        System.out.println("Please, enter positive integer from 1 to 100.");
                        continue;
                    }

                }

            }

            System.out.println("Please, enter 'R2D' or 'D2R.");
        }
    }


    /**
     * Converts decimal numbers to Roman.
     * <p>
     * Takes int value as a parameter. Works only with numbers from 1 to 100.
     *
     * @param number to convert to Roman.
     * @return string of Roman number.
     */
    public static String decimal2Roman(int number) {
//		<write your code here>
    }

    /**
     * Converts Roman numbers to decimal.
     * <p>
     * Takes string value with Roman number as a parameter.
     * <p>
     * At first method validates if input string could be Roman number. After method
     * uses algorithm to convert Roman numeral to decimal.
     *
     * @param romanNumber
     * @return decimal representation of Roman number
     */

    public static int roman2Decimal(String romanNumber) {
//		<write your code here>
    }


    /**
     * Validation for Roman numbers.
     * <p>
     * Use regular expression which is checking if string really could be Roman
     * number.
     *
     * @param romanNumber
     * @return true if String is Roman number
     */
    public static boolean isRomanNumberValid(String romanNumber) {
//	    <write your code here>
    }

    public static boolean isDecimalNumberValid(int decimalNumber) {
//		<write your code here>
    }
}
