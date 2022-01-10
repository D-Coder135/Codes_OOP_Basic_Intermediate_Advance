package final450DSA.array;

import java.util.ArrayList;

public class V_MoveNegativeElements {

    public void segregateElements(int[] arr, int n) {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }
    }

}
