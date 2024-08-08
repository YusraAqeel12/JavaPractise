//Inverted Half Pyramid
public class PatternFive {

    public static void main(String[] args) {
        //OuterLoops print 6 lines 
        for (int i = 0 ;i <=5 ;i++){
        //There will be two innerloops 
        //First Loop prints spaces
            for (int j = 0 ;j <= 5-i ; j++){
                System.out.print(" ");;

            }
        //Second Loop prints stars
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}