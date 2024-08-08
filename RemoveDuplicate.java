//Java Program to remove duplicates from an array 
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int array[] = {9, 8, 7, 9, 8, 7, 6};

        // Pehle array ko sort karte hain
        Arrays.sort(array);

        int temp[] = new int[array.length];
        int j = 0;

        // Adjacent elements ko compare kar ke duplicates remove karte hain
        //<= array.length ka sign nahi aayi gaa loop last index tak jaaigaa liken inner loop mai i+1 hai  jo aagay kai index ko access karnay ki koshish karay gaa which is not possible toh out of bound kaa error aayi gaa
        //since you cant access last element here hum manually last element ko access karingay
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];//9 is not equal to 8 so 9 temp array ki 0 index mai rakhaa jaiga 
                j++ ; //j mai increment hoga 
            }
        }

        // Last element ko add karte hain kyun ke loop mein wo add nahi hota
        //Last element is accessed manually -- Last element is 9 here 
        //array ki length-1 is 6 here so temp[j] can access arrays element at 6 index here
        temp[j++] = array[array.length - 1];

        // Result ko print karte hain
        for (int k = 0; k < j; k++) {
            System.out.println(temp[k]);
        }

        
    }
}

