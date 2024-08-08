import java.util.Scanner;

public class Func {
       public static int fact(int A ){
        int factorial = 1 ;
        for (int i = 1 ; i < A ; i ++  ){
            factorial = factorial * i;}
        return factorial ;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in) ;
        System.out.println("Enter");
        int A = Input.nextInt() ;
        int Output = fact(A);
        System.out.println(Output);
        

    }

}
