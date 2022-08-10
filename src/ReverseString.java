import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char [] letters = scanner.nextLine().toCharArray();


        int lengthOfArray = letters.length;
        for (int i = lengthOfArray - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
