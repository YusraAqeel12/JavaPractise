//Write a program to sort elements according to selection sort
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {9, 8, 7, 6, 5};
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Min index should be the index, not the value
            int minIndex = i;

            // Inner loop should start from i + 1
            for (int j = i + 1; j < n; j++) {
                // Find the index of the minimum element
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }
}
