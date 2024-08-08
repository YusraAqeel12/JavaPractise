//Write a program to add all elements given in input

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        
        int sum = 0;
        int temp = Math.abs(number); // Use absolute value to handle negative numbers
        
        while (temp != 0) {
    // Add digit to the sum -- Last sai shuru hota hai division 
            sum += temp % 10;
        // Removes the last // it is important to put this 
        //temp will divide last disgit of number which is 6 and give remainder 6 
        //if you dont put the line  below the temp will never change and loop will run infinitely
            temp /= 10 ;
        }
        
        System.out.println("The sum of the digits is: " + sum);
        
        input.close();
    }
}
