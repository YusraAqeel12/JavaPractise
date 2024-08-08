//Write a program to reverse an array

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int Array[] = {9, 8, 7, 6, 5};
        int Start = 0;
        int temp;
        int End = Array.length - 1;

        while (End >= Start) {
            // Temp mai 9 gaya
            temp = Array[Start];

            // Array ki 0 index mai 5 gaya
            Array[Start] = Array[End];

            // Array ki end position  mai 9 chalay jaiga
            Array[End] = temp;
            Start++;
            End--;
        }

        // Print the array after the reversal
         System.out.println(Arrays.toString(Array));
        
    }
}
