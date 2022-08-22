package Monday_22aug;

import java.util.Arrays;
import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = { 487, 205, 246, 226, 391, 190, 267, 40, 399, 473 };
        System.out.print("Enter an integer to check if it is in the array: ");
        Scanner scanner = new Scanner(System.in);
        int checkInt = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == checkInt) {
                found = true;
            }
        }

        if (found) {
            System.out.println("value " + checkInt + " found in array");
        } else {
            System.out.println("Value was not found in array");
        }

    }
}
