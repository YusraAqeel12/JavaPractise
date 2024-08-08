public class Fibinocci {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1 ;
        for (int i = 0 ; i < n ; i++){
            int sum = a+b ;
            a = b;
            b = sum;    
            System.out.println(sum);

        }
    }
}
