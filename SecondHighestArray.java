import java.lang.Integer;
public class SecondHighestArray {
    public static void main(String[] args) {
        int array[] = {9, 8, 7, 6};

        if (array.length < 2) {
            System.out.println("Array does not have enough elements to determine the second highest.");
            return;
        }

        // Initializing the first highest and second highest to the minimum possible integer value
        int FirstHighest = Integer.MIN_VALUE;
        int SecHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > FirstHighest) {
                SecHighest = FirstHighest; //0
                FirstHighest = array[i]; //9
                //8 bari hai 0 sai aur 8 barabar mahi hai 0 kai toh 8 is secondhighet
            } else if (array[i] > SecHighest && array[i] != FirstHighest) {
                SecHighest = array[i];
            }
        }
            System.out.println("Second highest number: " + SecHighest);
        
    }
}
