public class Hcf {
    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        int Min = (A < B) ? A : B; // Corrected to find the smaller number
        int hcf = 1;
        for (int i = 1; i <= Min; i++) { // Corrected the iteration condition
            if (A % i == 0 && B % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF is " + hcf); // Moved the print statement outside the loop
    }
}
