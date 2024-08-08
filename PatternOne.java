//Print 5 stars in row and column 
public class PatternOne {
    public static void main(String[] args) {
//It runs 5 times (i starts at 0 and goes up to 4), so it will print 5 lines of stars.
        for (int i = 0 ; i <= 4 ; i++){
// each iteration of the outer loop, this loop prints 4 stars (*) in a single line. It runs from j = 1 to j <= 4, so it prints 4 stars each time
            for (int j = 1 ; j <= 4 ; j++){
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
}
//Outer Loop for rows 
//Innrer Loops for columns
