import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int array[] = {9, 6, 7, 8, 0};

        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop should run until array.length - 1 - i
            // This is because with each outer loop iteration, the largest element gets bubbled to the end
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Correct condition to compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }
}
