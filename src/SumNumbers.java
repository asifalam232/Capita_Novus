import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int sumTotal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = scanner.nextInt();
        while (sumTo != 0) {
            sumTotal = sumTotal + sumTo;
            sumTo = sumTo -1;
        }
        System.out.print("SumTotal: " + sumTotal);
    }
}
