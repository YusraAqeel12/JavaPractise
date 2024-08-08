//Write a program to swap two numbers

public class Swap {
    public static void main(String[] args) {
        int a , b , temp;
        a=9;
        b=0;
        System.out.println("The Numbers before swapping are "+ a + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("The Numbers after swapping are " + a + b);
    }
}
