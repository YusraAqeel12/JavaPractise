import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {9, 8, 7};
        int b[] = {6, 5, 0};
        int c[] = new int[a.length + b.length];

        // Copy elements from array a to array c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        //c = {9, 8, 7, _, _, _}  // _ represents uninitialized elements

        // Copy elements from array b to array c
        for (int j = 0; j < b.length; j++) {
            c[j + a.length] = b[j];
        }

        // Print array c
        System.out.print("Merged Array c: ");
        for (int num : c) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(c));

    }
}

//[j + a.length] calculates the target index in array c where the elements from b should be copied, starting after the last element of a.
//First iteration (j = 0):

//c[0 + 3] = b[0] translates to c[3] = 6.
//Now, c looks like this: c = {9, 8, 7, 6, _, _}.
//Second iteration (j = 1):

//c[1 + 3] = b[1] translates to c[4] = 5.
//Now, c looks like this: c = {9, 8, 7, 6, 5, _}.
//Third iteration (j = 2):

//c[2 + 3] = b[2] translates to c[5] = 0.
//Now, c looks like this: c = {9, 8, 7, 6, 5, 0}.
