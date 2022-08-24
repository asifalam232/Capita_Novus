package tuesday_23aug;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        //Inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MyCalculator app that takes two" +
                "numbers and adds, subtracts ,multiplies and divides them.");
        System.out.print("Please enter Number 1 : ");
        double num1 = scanner.nextDouble();
        System.out.print("Please enter Number 2 : ");
        double num2 = scanner.nextDouble();

        //Outputs
        addNumbers(num1, num2);
        subtractNumbers(num1, num2);
        multiplyNumbers(num1, num2);
        divideNumbers(num1, num2);
    }

    //Add the numbers.
    static void addNumbers (double x, double y) {
        double result = x + y;
        System.out.println(x + " + " + y  + " = " + result);
    }

    //Subtract the numbers.
    static void subtractNumbers (double x, double y) {
        double result = x - y;
        System.out.println(x + " - " + y  + " = " + result);
    }

    //Multiply the numbers.
    static void multiplyNumbers (double x, double y) {
        double result = x * y;
        System.out.println(x + " * " + y  + " = " + result);
    }

    //Divide the numbers.
    static void divideNumbers (double x, double y) {
        double result = x / y;
        System.out.println(x + " / " + y  + " = " + result);
    }

}
