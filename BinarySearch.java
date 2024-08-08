

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        //sort the array
        int array[] = {9, 7, 5, 6, 0};  // Initial array: 9, 7, 5, 6, 0

        // Sort the array before performing binary search
        Arrays.sort(array);  // Sorted array will be: {0, 5, 6, 7, 9}
        int key = 0;  // Element to search for
        int lower = 0;  // Starting index
        int higher = array.length - 1;  // Ending index

        while (lower <= higher) {
            // Calculate the mid index

            int mid = (lower + higher) / 2;

            // Print current state

            if (key == array[mid]) {
                // If key is found
                System.out.println("Element Found at index " + mid);
                return;  // Exit the program once the element is found
//check kai Key 0 bara hai array[four] -- array kai fourth index kai elements sai which is 5
    //ans is no so lower side ki taraf jaao aur ussai aagay waala index dekho which is 0
            } else if (key < array[mid]) {
                // If key is smaller, search in the left half
                higher = mid - 1;
            } else {
                // If key is larger, search in the right half
                lower = mid + 1;
            }
        }

        // If the element is not found
        System.out.println("Element Not Found");
    }
}

//mid = (lower + higher) / 2 = (0 + 4) / 2 = 2
 //Compare key (0) with array[mid] (6):
//key < array[mid] is true (0 < 6), so update higher = mid - 1 = 1
//Iteration 2:

//mid = (lower + higher) / 2 = (0 + 1) / 2 = 0
//Compare key (0) with array[mid] (0):
//key == array[mid] is true, so print "Element Found at index 0" and exit.