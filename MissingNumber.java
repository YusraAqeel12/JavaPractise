public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9}; // Example array with one missing number
        int n = array.length + 1; // Number of elements including the missing one
        int expectedSum = (n * (n + 1)) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        // Calculate the actual sum of elements in the array
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number in the array is: " + missingNumber);
    }
}
