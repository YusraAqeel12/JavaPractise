//Find How many times an character occurs in String
public class OccurenceCharacter{
    public static void main(String[] args) {
        String Input = "my name is yusra";
        char ch [] = Input.toCharArray();
        int count = 0;
        char X = 'a';
        for (int i = 1 ; i < Input.length() ; i++){
            if (X == ch[i]){
                count ++;    
            } 
        }        
        System.out.println(count);

    }
}
