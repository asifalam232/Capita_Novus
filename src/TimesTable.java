import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What times table would you like? : ");
        int timesTable = scanner.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.print(timesTable + " x " + i + " = " + timesTable*i);
            System.out.println("\n");
        }
    }
}
