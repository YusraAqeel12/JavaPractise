// Count letters number and spaces in the given string

import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Input ");
        String a = Input.nextLine();
        // Converts String Into Character Array
        // My name is Yusra
        char ch[]=a.toCharArray();
        int length = a.length();
        int space = 0 ;
        int letter = 0;
        int number = 0;
        int other = 0;
        for (int i = 0;i < length ; i ++ ){
            if ( Character.isLetter( ch[i])  )
            {
                letter++;
            }

            else if (Character.isDigit(ch[i])) {
                number ++;
            }

            else if (Character.isSpaceChar(ch[i])) {
                space ++;
            }
        }

        System.out.println(letter);
        System.out.println(number);
        System.out.println(space);


    }
}
