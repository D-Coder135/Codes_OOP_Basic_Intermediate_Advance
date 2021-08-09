/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 08/08/21
 *   Time: 3:13 PM
 *   File: PracticeCode3.java
 */

package oopsBasicToAdvanceCourse.methodsPractice;

import java.util.Scanner;

public class PracticeCode3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String text = sc.nextLine();

        int amountOfWords = getWordsAmount(text);

        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    private static int getWordsAmount(String text) {
        int amountOfWords = 0;
        if (text.isEmpty()) {
            System.err.println("String is empty!");
        } else if (text.isBlank()) {
            System.err.println("String is blank!");
        } else {
            for (int index = 0; index < text.length(); index++) {
                char character = text.charAt(index);
                if (character == ' ' || index == text.length() - 1) {
                    ++amountOfWords;
                }
            }
        }
        return amountOfWords;
    }
}
