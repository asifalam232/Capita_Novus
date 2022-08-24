package tuesday_23aug.PersonCreator;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person("James Peterson", 34, 180, 73.5);
        Person person02 = new Person("Bob Thornley", 25, 171, 68.2);


        System.out.println(person01);
        person01.growOlder();
        System.out.println(person01);
        System.out.println(person02);

    }
}
