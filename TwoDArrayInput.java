import java.util.Scanner;
class DimensionalArray{
    //To Print Array
    public void ArrayMethod(int arr [] [] ){
    //Iterates Over the row of TwoDArray
        for (int i = 0 ; i < arr.length ; i++){ //row
    //Iterates over the col of TwoDArray -- Arr[i].length gives no of col in current row    
    //Iterates over each col of current row 
    for(int j = 0 ; j < arr[i].length ; j++){
    //Prints the elements at position [i][j]
                System.out.print(arr[i][j]);
            }
    //Print the R in new line
            System.out.println();
        }

    }
}

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in) ;
        System.out.println("Enter Row");
        int r = Input.nextInt() ;
        System.out.println("Enter Column");
        int c = Input.nextInt() ;
        int [] [] arrTwo = new int[r][c] ;

        //Taking Input
        System.out.println("Enter " +r*c+ " Elements");
        for(int i = 0 ; i <r;i++){
            for(int j = 0 ; j < c ; j++){
                arrTwo[i][j] = Input.nextInt();

            }
            System.out.println();

        }
        DimensionalArray d = new DimensionalArray() ;
        d.ArrayMethod(arrTwo);


    }
}
