package tuesday_23aug.PersonCreator;

public class Person {
    private String name;
    private int age;
    private int height;
    private double weight;

    public Person(String name, int age, int height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height + "cm" +
                ", weight=" + weight + "lbs" +
                '}';
    }

    public void growOlder() {
        age++;
        height--;
        weight = weight - 0.5;
    }
}
