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

    peterson;Chris Peterson:perterson@outlook.com
    james;Derek James;james@gmail.com
    jackson;Walter Jackson;Jackson@gmail.com
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
        String formattedString = "";
        String requiredPart = "";
        for (int index = 1; index < stringArray.length; index++) {
            String temp = stringArray[index];
            for (int j = 0; j < temp.length(); j++) {
                char character = temp.charAt(j);
                if (character != ';') {
                    requiredPart = requiredPart.concat(String.valueOf(character));
                } else {
                    formattedString = formattedString.concat(String.format("%s ===> ", requiredPart));
                    requiredPart = "";
                    do {
                        j++;
                        character = temp.charAt(j);
                    } while (character != ';');
                }
            }
            formattedString = formattedString.concat(" " + requiredPart + System.lineSeparator());
            requiredPart = "";
        }
        return formattedString;
    }

    public static String convert2(String input) {
        String[] stringArray = INPUT_DATA.split("[\r\n]+");
        String formattedString = "";
        String requiredPart = "";
        for (int index = 1; index < stringArray.length; index++) {
            String temp = stringArray[index];
            for (int j = 0; j < temp.length(); j++) {
                char character = temp.charAt(j);
                if (character != ';') {
                    continue;
                }
            }
        }
    }
}
