// Multiples Of a Table
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        int a , i;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Number");
        a=input.nextInt();
        for ( i=0 ;i < 11 ; i++){
            System.out.println(a + "*" + i + "=" + a*i);
        }

    }
}
