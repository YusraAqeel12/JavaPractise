//Write a program to reverse a string 

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String userInput = input.nextLine();
        
        String reverse = "";  // Initialize the reverse string
        char[] ch = userInput.toCharArray();
        int length = userInput.length();
        
        System.out.println("Length of the string: " + length);
        
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }
        
        System.out.println("Reversed string: " + reverse);
        
        input.close();
    }
}
 // yusra length string ki 5 hai liken jab hum array mai change kartay hain toh it starts from index 0
    // ch[i] print karna hai
    // For loop kai baahir print karana hai 