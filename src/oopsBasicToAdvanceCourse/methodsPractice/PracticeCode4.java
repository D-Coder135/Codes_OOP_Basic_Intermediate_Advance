/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 09/08/21
 *   Time: 6:49 PM
 *   File: PracticeCode4.java
 */

/*
 Problem Statement =>
 1. Program starts and asks user to enter random words separated by space.
 2. Program asks user to enter minimum length of string to filter words which were entered.
 3. Program creates array object from entered words.
 4. Program calls specific method which takes String[] as a parameter and returns array of string which contains words
    that have length more or equal to value specified by user.
  */


package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticeCode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minimum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }


    public static String[] filterWordsByLength(int minLength, String[] words) {
        String[] resultantArray;
        List<String> resultantList = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= minLength) {
                resultantList.add(word);
            }
        }
        resultantArray = new String[resultantList.size()];
        for (int index = 0; index < resultantList.size(); index++) {
            resultantArray[index] = resultantList.get(index);
        }
        return resultantArray;
    }
}
