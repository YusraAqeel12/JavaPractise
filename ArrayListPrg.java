import java.util.ArrayList;
import java.util.Collections;;
//Hashset -- LinkedList have same properties as ArrayList except for some 
public class ArrayListPrg {
    public static void main(String[] args) {
        ArrayList <Integer> ListOne = new ArrayList<Integer>() ;

        //Add Elements
        ListOne.add(9) ;
        ListOne.add(8) ;
        ListOne.add(7) ;
        ListOne.add(5) ;
        ListOne.add(6) ;

        //Add Element on specific index 
        ListOne.add(0, 99);

        //Replaces the element at the specified position in this list with the specified element
        ListOne.set(0, 6) ;
        
        
        System.out.println(ListOne);

        //Print Size
        System.out.println(ListOne.size() );;

        //Retrive element at specified Index
        System.out.println(ListOne.get(0));
        
        //Remove the element in a specific index
        ListOne.remove(5) ;

        //Search For Element 
        if (ListOne.contains(0)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        } ;

        //Shuffle Elements
        Collections.shuffle(ListOne);
        System.out.println(ListOne);

        //Sort Elements
        Collections.sort(ListOne);

        //Reverse Elements 
        Collections.reverse(ListOne);

        //Iterate Over each elements
        for(int i = 0 ; i < ListOne.size() ; i ++){
            System.out.println(ListOne.get(i));

        }
    
    
    
    }
}
