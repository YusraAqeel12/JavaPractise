// Dont forget break and while conditions
public class lcm {
    public static void main(String[] args) {
        int A =4;
        int B= 6;
// agar A bara hai B sai toh Max will be A warna Will be B
        int Max= (A>B)?A:B;
// T and F is F || T and T is T
        while (true) {
            if ( Max % A == 0 && Max % B == 0) {
                System.out.println("The LcM is " + Max);    
            break;      
            }
         Max++;

            
        }
    }
}

// Break is imp warna loop chalta rahay gaa 
// max ka increment is imp in the last  