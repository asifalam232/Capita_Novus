public class CircleCalculator {
    public static void main(String[] args) {
//        Declaring the variable circleRadius.
        double circleRadius = 12.0;

//        Print the radius.
        System.out.println("The radius of the circle is " + circleRadius);

//        Calculate the Diameter. Diameter = 2 * Radius.
        double circleDiameter = 2 * circleRadius;

//        Print the Diameter.
        System.out.println("The diameter of the circle is " + circleDiameter);

//        Calculate the Circumference. Circumference = 2 * Pi * Radius.
        double circleCircumference = 2 * Math.PI * circleRadius;

//        print the Circumference.
        System.out.println("The circumference of the circle is " + circleCircumference);

//        Calculate the area. area = pi * (radius * radius )
        double circleArea = (Math.PI * (circleRadius * circleRadius));

//        print the area.
        System.out.println("The area of the circle is " + circleArea);
    }
}
