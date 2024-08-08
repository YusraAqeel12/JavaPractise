// Find Area And the Perimeter
import java.util.Scanner;

public class AreaNPermieter {
    public static void main(String[] args) {
        int area , l , b , perimeter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        l=input.nextInt();
        System.out.println("Enter Breadth");
        Scanner inputSec = new Scanner(System.in);
        b=inputSec.nextInt();
        area=l*b;
        System.out.println("The Area of the circle is" + area);
        
    }
}
