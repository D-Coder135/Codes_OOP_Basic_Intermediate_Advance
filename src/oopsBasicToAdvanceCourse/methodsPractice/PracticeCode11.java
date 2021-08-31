/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 30/08/21
 *   Time: 11:30 PM
 *   File: PracticeCode11.java
 */


/*
 Problem Statement =>
 1. Program starts and asks user to select more:
    a. to convert from decimal to Roman number user should enter D2R
    b. to convert from Roman number to decimal user should enter R2D
 2. In case user entered random text, program asks user again to enter either D2R or R2D.
 3. In case user entered R2D, program asks user to enter Roman number.
 4. In case this is invalid Roman number, program asks user to enter Roman number again.
 5. In case this is valid Roman number, program converts it to decimal and prints to console.
 6. In case user entered D2R, program asks user to enter integer.
 7. In case this is negative integer number or more than 100 or zero, program asks user to enter integer number again.
 8. In case this is valid integer, program converts it to Roman number and prints to console.
 9. Program works properly with range of numbers from 1 to 100 inclusively and the same range for Roman numbers.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Locale;
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
        String[] roman = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        int[] decimal = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100};
        StringBuilder resultant = new StringBuilder();
        for (int index = roman.length - 1; index >= 0; index--) {
            while (number >= decimal[index]) {
                resultant.append(roman[index]);
                number -= decimal[index];
            }
        }
        return resultant.toString();
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
        String romanNumeral = romanNumber.toUpperCase();

        int decimal = 0, lastNumber = 0;

        for (int index = romanNumeral.length() - 1; index >= 0; index--) {
            char characterOfRomanNumber = romanNumber.charAt(index);

            switch (characterOfRomanNumber) {
                case 'C' -> {
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                }
                case 'L' -> {
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                }
                case 'X' -> {
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                }
                case 'V' -> {
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                }
                case 'I' -> {
                    decimal = processDecimal(1, lastNumber, decimal);
                }
            }
        }
    }

    /**
     * Utility method which is the part of algorithm that converts Roman numbers to
     * decimal.
     *
     * @param decimal
     * @param lastNumber
     * @param lastDecimal
     * @return int value
     */
    private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
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
