//Inverted Half Pyramid
public class PatternSeven {
    public static void main(String[] args) {
        for (int i = 1 ;i <=5 ; i++){
            for (int j = 1 ; j <=5-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//First Iteration (i = 1):

//Inner loop: j runs from 1 to 5 (5 - 1 + 1 = 5).
//Prints: 12345
//System.out.println(); moves to the next line.