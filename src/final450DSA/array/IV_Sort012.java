package final450DSA.array;

public class IV_Sort012 {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort012(int a[], int n) {
        // code here
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0 -> {
                    swap(a, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    swap(a, mid, high);
                    high--;
                }
            }
        }
    }
}
