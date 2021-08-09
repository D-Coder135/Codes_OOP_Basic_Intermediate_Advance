/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 08/08/21
 *   Time: 2:27 PM
 *   File: PracticeCode2.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to input height of the rectangle.
 2. After user inputs heights of the rectangle, program asks to input width of the rectangle.
 3. Program calls specific method which takes two parameters of int types which prints rectangle to the console.
 NOTE: Rectangle is empty inside.
  */


package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
		int newHeight = height - 2;
        System.out.print("\t");
        for (int i = 0; i < width; i++) {
            System.out.print("+");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < newHeight; i++) {
            System.out.print("+" + "\t" + "\t" +  "+");
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < width; i++) {
            System.out.print("+");
        }
    }

}
