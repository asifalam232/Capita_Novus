package Wednesday_challenges;

import java.util.Scanner;

public class TimesTable
{
    public static void main(String[] args)
    {
//        Take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What times table would you like? : ");
        int timesTable = scanner.nextInt();

//        Loop 12 times and multiply the input with i.
        for (int i = 1; i < 13; i++)
        {
            System.out.print(timesTable + " x " + i + " = " + timesTable*i);
            System.out.println("\n");
        }
    }
}
