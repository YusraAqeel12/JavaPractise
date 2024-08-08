import java.util.Arrays;

public class OccurrenceArr {
    public static void main(String[] args) {
        int array[] = {9, 9, 8, 7, 6, 8};
        Arrays.sort(array); // Sorting the array to group identical elements together

        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // Skip if this element has already been counted
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            
            // Count occurrences of the current element
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            
            // Print the count for the current element
            System.out.println("The frequency of " + array[i] + " is " + count);
        }
    }
}
