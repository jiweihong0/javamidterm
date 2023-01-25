// write a selected sort

import java.util.Arrays;

public class Selectedsort {
    public static void main(String[] args) {
        int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
        selectedSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectedSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}



