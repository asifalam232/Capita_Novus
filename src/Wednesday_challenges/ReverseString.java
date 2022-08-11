package Wednesday_challenges;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
//        Takes input and puts them in a character array.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char [] letters = scanner.nextLine().toCharArray();


        int lengthOfArray = letters.length;
//        Loops through the array from the back and prints out the characters.
        for (int i = lengthOfArray - 1; i >= 0; i--)
        {
            System.out.print(letters[i]);
        }
    }
}
