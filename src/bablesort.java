import java.util.Arrays;

public class bablesort {
    public static void bubbleSort(int[] arr) {
    int temp;
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
    
        }
    }
    
    
}
public static void main(String[] args) {
    int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
    bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    // or
    System.out.println(Arrays.toString(arr));
}
}

