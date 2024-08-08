//Java program to check if input is anagram

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {         
        Scanner Input = new Scanner(System.in) ;
        System.out.println("Enter First Input ");

         String first = Input.next() ;
        Scanner inputSec = new Scanner(System.in) ;
        System.out.println("Enter Second Input ");

         String Second = inputSec.next() ;

         if (first.length() != Second.length()) {
            System.out.println("Not A Anagram");
            
         }
         else{
            char FirstCh [] = first.toCharArray() ; //['a''e''i']
            char SecondCh [] = Second.toCharArray() ;
            Arrays.sort(FirstCh);
            Arrays.sort(SecondCh);

            if (Arrays.equals(FirstCh, SecondCh)){
                System.out.println("Is an Anagram"); ;
            }
            else{
                System.out.println("Not"); ;
            } }
    
    }
}