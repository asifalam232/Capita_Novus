package tuesday_23aug;

import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args) {
        //Inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MinMaxMethods app that takes three " +
                "numbers and and finds the maximum and minimum between them.");
        System.out.print("Please enter Number 1 : ");
        String str1 = scanner.nextLine();
        System.out.print("Please enter Number 2 : ");
        String str2 = scanner.nextLine();
        System.out.print("Please enter Number 3 : ");
        String str3 = scanner.nextLine();

        if (str1.contains(".") && str2.contains(".") && str3.contains(".")) {
            double num1 = Double.parseDouble(str1);
            double num2 = Double.parseDouble(str2);
            double num3 = Double.parseDouble(str3);
            maxMethod(num1, num2, num3);
            minMethod(num1, num2, num3);
        } else {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int num3 = Integer.parseInt(str3);
            maxMethod(num1, num2, num3);
            minMethod(num1, num2, num3);
        }

    }

    static void maxMethod (int x, int y, int z) {
        int max;
        if (x > y && x> z) {
            max = x;
        } else if (y > z) {
            max = y;
        } else {
            max = z;
        }
        System.out.println("Out of " + x + ", " + y + ", " + z + " maximum is " + max);
    }

    static void maxMethod (double x, double y, double z) {
        double max;
        if (x > y && x> z) {
            max = x;
        } else if (y > z) {
            max = y;
        } else {
            max = z;
        }
        System.out.println("Out of " + x + ", " + y + ", " + z + " maximum is " + max);
    }

    static void minMethod (int x, int y, int z) {
        int min;
        if (x < y && x < z) {
            min = x;
        } else if (y < z) {
            min = y;
        } else {
            min = z;
        }
        System.out.println("Out of " + x + ", " + y + ", " + z + " minimum is " + min);
    }

    static void minMethod (double x, double y, double z) {
        double min;
        if (x < y && x < z) {
            min = x;
        } else if (y < z) {
            min = y;
        } else {
            min = z;
        }
        System.out.println("Out of " + x + ", " + y + ", " + z + " minimum is " + min);
    }

}
