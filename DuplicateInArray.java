//Find Duplicates In Array

public class DuplicateInArray {
    public static void main(String[] args) {
        int array[] = {9,8,7,6,6};
// need two loop , one is for iteation and one for comparing
        for (int i = 0 ; i < array.length; i ++){

//Comparing with next element 
            for (int j=i+1 ; j < array.length ; j++) {
// agar same nahi toh i will be 9 j will compare with all values
                if (array[i] == array[j]){
                    System.out.println("Element Found  " + array[i]);

                }
                
            }

        }
    }

    
}