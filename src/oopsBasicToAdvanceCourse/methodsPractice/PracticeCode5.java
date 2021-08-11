/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 10/08/21
 *   Time: 12:01 AM
 *   File: PracticeCode5.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to specify matrix size. For example if user entered '5' program will generate next matrix.
 2. Program asks user this question with options:
    How much do you want to rotate matrix?
  - Press 1 to rotate matrix to 90 degrees
  - Press 2 to rotate matrix to 180 degrees
  - Press 3 to rotate matrix to 270 degrees
 3. When user chosen rotation mode programs prints initial matrix and rotated one.
  */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();

        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
        }
    }

    public static double[][] generateMatrix(int size) {
        double[][] resultantMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0) {
                    resultantMatrix[i][j] = (double) j;
                } else if (i == 1) {
                    resultantMatrix[i][j] = (double) j + 0.1;
                } else if (i == 2) {
                    resultantMatrix[i][j] = (double) j + 0.2;
                } else if (i == 3) {
                    resultantMatrix[i][j] = (double) j + 0.3;
                } else {
                    resultantMatrix[i][j] = (double) j + 0.4;
                }
            }
        }
        return resultantMatrix;
    }

    public static void printMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate90(double[][] matrix) {
//		<write your code here>
    }

    public static void rotate180(double[][] matrix) {
//		<write your code here>
    }

    public static void rotate270(double[][] matrix) {
//		<write your code here>
    }
}
