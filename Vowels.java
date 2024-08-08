//Count number of vowels in Strings and find if the string contains vowels


public class Vowels {
    public static void main(String[] args) {
        String a = "m" ;
        int count = 0 ;
        boolean hasvowels = false ;
        for (int i = 0 ; i < a.length() ; i++){
            //extract characters from string jo kai i index per hai 
            char ch = a.charAt(i) ; 
            if (ch=='a' || ch=='e' || ch=='i' || ch == 'o' || ch == 'u'){
                count++ ;
                 hasvowels = true ;

            }
        }
        System.out.println(count);

        //To print that the string has vowels or not
        if(hasvowels){
            System.out.println("The String contains vowels");
        }
        else{
            System.out.println("The String does not have vowels");
        }
    }
}

//returns a character value at specified index agar i ko print karogay toh i will print index value of string
//agar ch ko print karogay toh it will give characters
//   System.out.println(i);   System.out.println(ch);
//ch gives character and i gives character at specified index
//true or true is true