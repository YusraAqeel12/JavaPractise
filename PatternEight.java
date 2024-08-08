//Floyd Triangle
public class PatternEight {
    public static void main(String[] args) {
        int number = 1 ;
        for(int i = 0 ; i <=  5 ; i++){
            //J ko print nahi karingay jo kai increase hota rahay gaa
            for (int j=1 ; j <= i ; j ++){
                System.out.print(number + " ");
                number++ ;
            }
            System.out.println();
        }
    }
}
