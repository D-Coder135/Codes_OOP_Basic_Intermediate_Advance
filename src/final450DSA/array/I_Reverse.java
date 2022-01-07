package final450DSA.array;

import java.util.Scanner;

public class I_Reverse {
    public static void main(String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = scanner.nextInt();
            }
        }
    }
}
