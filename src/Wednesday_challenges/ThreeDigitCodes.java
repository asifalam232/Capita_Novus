package Wednesday_challenges;

public class ThreeDigitCodes
{
    public static void main(String[] args)
    {
//        Keeps track of the amount of three-digit codes.
        int count = 0;

//        The for loops iterate through the numbers.
//        The first for loop keeps track of the first digit or 100.
//        The second for loop keeps track of the second digit or 10.
//        The third for loop keeps track of the third digit or 1.
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                for (int k = 1; k <= 4; k++)
                {
//                    Check if the digits are same or not.
                    if (i != j && i != k && j != k)
                    {
//                        Print out the numbers and for each successful code increment the count.
                        System.out.print(i + "" + j + "" + k);
                        System.out.print("\n");
                        count++;
                    }
                }
            }
        }
        System.out.println("Amount of three-digit numbers that are possible is " + count);
    }
}
