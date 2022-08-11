package Wednesday_challenges;

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
//        The total sum.
        int sumTotal = 0;
//        Takes an input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = scanner.nextInt();

//        Starts from the input value and adds it to the total sum and then decreases the
//        value. While loop ends if input reaches zero.
        while (sumTo != 0)
        {
            sumTotal = sumTotal + sumTo;
            sumTo = sumTo -1;
        }
        System.out.print("SumTotal: " + sumTotal);
    }
}