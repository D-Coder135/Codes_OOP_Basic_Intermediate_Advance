/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 16/08/21
 *   Time: 11:31 PM
 *   File: PracticeCode9.java
 */

/*
 Problem Statement =>
 1. Program contains methods that can process input string according to requirements below.
 2. You have input string like this:

    Login;Name;Email

    Peterson;Chris Peterson:perterson@outlook.com
    James;Derek James;james@gmail.com
    Jackson;Walter Jackson;Jackson@gmail.com
    gregory:Mike Gregory:gregory@yahoo.com

    1. Your program has next method. Which formats input data likes this:
       peterson ===> peterson@outlook.com
       jackson ===> jackson@gmail.com
       gregory ===> gregory@yahoo.com

    2. Your program has next method. Which formats input data like this:
       Chris Peterson (email: peterson@outlook.com)
       Derek James (email: james@gmail.com)
       Walter Jackson (email: jackson@gmail.com)
       Mike Gregory (email: gregory@yahoo.com)
  */


package oopsBasicToAdvanceCourse.methodsPractice;

public class PracticeCode9 {
    public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
            "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
            "james;Derek James;james@gmail.com" + System.lineSeparator() +
            "jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
            "gregory;Mike Gregory;gregory@yahoo.com";

    public static void main(String[] args) {
        System.out.println("===== Convert 1 demo =====");
        System.out.println(convert1(INPUT_DATA));

        System.out.println("===== Convert 2 demo =====");
        System.out.println(convert2(INPUT_DATA));

    }

    public static String convert1(String input) {
        String[] stringArray = INPUT_DATA.split("[\r\n]+");
    }

    public static String convert2(String input) {
//		<write your code here>

    }
}
