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


public class TwoDArray {
    public static void main(String[] args) {
        //Initialize array
        int [][] arrTwo= {{7,8,9}  , {9,8,7} , {0,6,8}} ; // Values kudh mai hee array hai
        DimensionalArray d = new DimensionalArray() ;
        d.ArrayMethod(arrTwo);
    }
}

//First Iteration (i = 0):

//Inner Loop (j):
//arr[0][0] = 7 is printed.
//arr[0][1] = 8 is printed.
//arr[0][2] = 9 is printed.
//System.out.println() moves to the next line.