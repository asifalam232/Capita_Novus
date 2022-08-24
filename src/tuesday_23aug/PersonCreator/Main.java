package tuesday_23aug.PersonCreator;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);

        System.out.println("Person 1:");
        System.out.print("Name: " + person01.getName() + "\n"
                + "Age: " + person01.getAge() + "\n"
                + "Height: " + person01.getHeight() + "cm" + "\n"
                + "Weight: " + person01.getWeight() + "lbs" + "\n");
        System.out.println("Person 2:");
        System.out.print("Name: " + person02.getName() + "\n"
                + "Age: " + person02.getAge() + "\n"
                + "Height: " + person02.getHeight() + "cm" + "\n"
                + "Weight: " + person02.getWeight() + "lbs");
    }
}
