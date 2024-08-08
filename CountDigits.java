//Calculate No of digits in given input

public class CountDigits {
    public static void main(String[] args) {
        int n = 9876 ;
        int count = 0 ;
// jab tak number 0 kai baraber nahi hota us waqt tak number ko divide
// karo and count mai increase kartay jaaon
        while (n != 0){
            n = n/10; //987 so count is 1 98 so count is 2  9 so count is 3  0.9 sp count is 4
            count ++ ;
        }   
        System.out.println(count); 
    }
}
