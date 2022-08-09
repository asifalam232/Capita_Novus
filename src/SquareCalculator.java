import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

//        Reading the inputs and setting the variables
//        width and height.
        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());

//        Printing the variables.
        System.out.println("The width is " + width);
        System.out.println("The height is " + height);

//        Calculating the perimeter. perimeter = 2*(width + height).
        double perimeter = (2 * (width + height));

//        Printing the perimeter.
        System.out.println("The perimeter is " + perimeter);

//      Calculating the area. perimeter = width * height.
        double area = width * height;

//        printing the area
        System.out.println("The area is " + area);
    }
}
