import java.util.HashMap;
public class HashmapsPrg {
    public static void main(String[] args) {
        HashMap <String , Integer> first = new HashMap<>() ;
        first.put("Pakistan" , 9) ;
        first.put("India" , 8) ;
        first.put("Iran", 7) ;

        //Key exist the value will be updated -- if not the value is inserted 
        first.put("Iraq", 7) ;


        
    }
}
