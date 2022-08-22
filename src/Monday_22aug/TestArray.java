package Monday_22aug;


public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = { 487, 205, 246, 226, 391,
                190, 267, 40, 399, 473 };

        System.out.print("The array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
            // Adds the elements of the array to the sum
            sum = sum + i;
        }

        // Print out the sum.
        System.out.println("\nThe sum of the array is: " + sum);

        // Calculate average and print it out
        double average = Double.valueOf(sum) / numbers.length;
        System.out.println("The average of the array is: " + average);
    }
}
