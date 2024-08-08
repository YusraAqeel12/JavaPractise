//Java program to add two numbers
public class AddNumbers {
    
    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        
        // Call the add function and store the result
        int sum = add(num1, num2);
        
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
