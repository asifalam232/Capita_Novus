package tuesday_23aug;

import java.util.Scanner;

public class FibonacciCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers you want in Integer form: ");
        int n = scanner.nextInt();
        System.out.println("The first " + n + " fibonacci numbers are: ");
        Fibonacci(n);
    }

     static void Fibonacci (int n) {
        long num1 = 0;
        long num2 = 1;
        int counter = 0;

        while (counter < n) {
            System.out.print(num1 + " ");
            long sum = num2 + num1;
            num1 = num2;
            num2 = sum;
            counter++;
        }
    }
}
