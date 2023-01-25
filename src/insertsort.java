import java.util.Arrays;
public class insertsort {
   
        public static void insertionSort(int[] arr) {
            int key, j;
            for (int i = 1; i < arr.length; i++) {
                key = arr[i];
                j = i - 1;
        
                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
        
        public static void main(String[] args) {
            int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
            insertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
        

