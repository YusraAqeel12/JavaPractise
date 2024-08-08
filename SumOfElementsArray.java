//Write a program to add all elements in an array
public class SumOfElementsArray {
    public static void main(String[] args) {
        int array [] ={9,0,5} ;
        int sum = 0 ;
        for( int i = 0 ; i < array.length ; i ++){
            sum = array[i] + sum;
        }
        System.out.println(sum);
    }
}
