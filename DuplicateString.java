//Find duplicates in string
public class DuplicateString {

    public static void main(String[] args) {
        String a = "my name is yusra " ;
        //splits string into array of words when there is whitespace
        //(\s stands for any whitespace character like space, tab, newline, etc., and + means "one or more").
        String list[] = a.split("\\s+") ;
        for (int i = 0 ; i <= list.length-1 ; i++){
            System.out.println(list[i]);
            for (int j = i+1 ; j < list.length ; j++){
                if(list[i].equals(list[j])){
                    System.out.println("Duplicate Found" + list[i]);
                }
              
            }

        }
        System.out.println("No Duplicates");
    }
}

//String kai liyae we use equal 